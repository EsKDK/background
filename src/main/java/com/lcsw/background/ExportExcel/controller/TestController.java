package com.lcsw.background.ExportExcel.controller;

import com.lcsw.background.ExportExcel.util.ExportExcelUtil;
import com.lcsw.background.ExportExcel.util.ExportExcelWrapper;
import com.lcsw.background.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController("test")
public class TestController {
    @RequestMapping("/get/excel")
    public void getExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 准备数据
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Student(111,"张三asdf","男"));
            list.add(new Student(111,"李四asd","男"));
            list.add(new Student(111,"王五","女"));
        }
        String[] columnNames = { "ID", "姓名", " 性别"};
        String fileName = "excel1";
        ExportExcelWrapper<Student> util = new ExportExcelWrapper<Student>();
        util.exportExcel(fileName, fileName, columnNames, list, response, ExportExcelUtil.EXCEL_FILE_2003);
    }
}


