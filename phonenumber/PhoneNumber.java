/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumber;

import java.util.Objects;

/**
 *
 * @author Юрий
 */
public class PhoneNumber {
    
    private String regionCode;
    private String localNumber;

    public PhoneNumber(String regionCode, String localNumber) {
        this.regionCode = regionCode; // regionCode который мы сейчас создаем = аргументу areaCode который указан в конструкторе
        this.localNumber = localNumber; // localNumber  который мы сейчас создаем = аргументу localNumber который указан в конструкторе
        checkValue(regionCode, "region code");
        checkValue(localNumber, "local number");
    }

    public String getRegionCode() {
        return regionCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }
    
    
    private void checkValue(String value, String partName){
        if(value == null){
            throw new NullPointerException(partName + " empty value.");
            }
        if (value.isEmpty()){
                throw new IllegalArgumentException(partName + " empty line.");         
        }
        for(int i = 0; i < value.length(); i++){
            char ch = value.charAt(i); //  метод charAt() возвращает указанный символ из строки
            
        if (!Character.isDigit(ch)) // Character.isDigit() возвращает значение true, если переданный символ цифра
            throw new IllegalArgumentException(partName + " contains invalid characters.");
        
    }
    
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.regionCode);
        hash = 73 * hash + Objects.hashCode(this.localNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof PhoneNumber)) return false; //если неправильный тип объекта то и нечего дальше сравнивать.
        PhoneNumber temp = (PhoneNumber) obj; //создаем переменную нужного нам типа, а в эту переменную ложим объект приведенный к типу PhoneNumber.
        return temp.getRegionCode().equals(regionCode) && temp.getLocalNumber().equals(localNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();// Класс для работы с текстовыми данными 
        sb.append('(').append(regionCode).append(')');
        int p = localNumber.length() % 2 + 2 ; // расчет сколько знаков до тире
        
        if (p < localNumber.length()) {
            sb.append(localNumber, 0, p);
            
            while (p <= (localNumber.length() - 2)) {
                sb.append('-').append(localNumber, p, p + 2);
                p += 2;
            }
        }else
            sb.append(localNumber);

        return sb.toString();
    }
    
    
    
}
