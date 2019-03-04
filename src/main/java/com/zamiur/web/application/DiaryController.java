package com.zamiur.web.application;

import com.zamiur.business.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value= "/diary")
public class DiaryController {
    @Autowired
    private DiaryService diaryService;

    @RequestMapping(method = RequestMethod.GET)
    public String getNotes() {
        diaryService.saveNote();
        return "notes";
    }
}
