package com.codegym.casestudy.validation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Stack;
import java.util.regex.Pattern;
//
public class Valid {
//    -	Mã dịch vụ phải đúng định dạng: SVXX-YYYY, với YYYY là các số từ 0-9, XX là:
//-	Nếu là Villa thì XX sẽ là VL
//-	Nếu là House thì XX sẽ là HO
//-	Nếu Room thì XX sẽ là RO
//-	Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường
//-	Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m2
//-	Chi phí thuê phải là số dương
//-	Số lượng người tối đa phải >0 và nhỏ hơn <20
//-	Số tầng phải là số nguyên dương.
//-	 Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch v
//-	Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm, người dùng không được quá 100 tuổi và phải đúng định dạng dd/mm/YYYY (sử dụng User Exception)
    public static final String dayRegex = "[0-3][0-9]+[0-1][0-2]+[0-1][0-9][0-9][0-9]";
    public static final String EmailREGEX = "[A-Za-z0-9]+@[A-Za-z0-9]+.com";
    public static final String IdRegex = "[0-9]{8}";
    Pattern patternId = Pattern.compile(IdRegex);
    Pattern patternDay = Pattern.compile(dayRegex);
    Pattern patternEmail =Pattern.compile(EmailREGEX);
    private String dateFormat = "dd/mm/yy";
    public boolean isValid(String dateStr) {
        DateFormat sdf = new SimpleDateFormat(this.dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}
