package com.example.demo;

import org.springframework.stereotype.Controller;
//đánh dấu lớp này là controller
import org.springframework.ui.Model;
//interface giao tiếp giữa c và v
import org.springframework.web.bind.annotation.GetMapping;
//đánh dấu phương thức request tới URL cụ thể, khi rq gọi tói URL thì SPF gọi pthuc tg ứng và trả về kq cho client
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//truyền dữ liệu giữa các phương thức xử lý của 1 controller
//cho phép truyền thuộc tính giữa các phương thức và chuyển hướng request tới url
@Controller
public class HomeController {
    // khai báo lớp homeocntroller và đánh dấu nó là 1 sp controller
    @GetMapping("/") // xử lí và trả về return
    public String Index(Model model) {
        return "home/index";
        // get request tới url / và trả về file index.html hiển thị cho người dùng
    }

    @PostMapping("/add") // xử lí thêm mới sv vào hệ thống và thêm mới
    public String Add(SV sv, RedirectAttributes model, Model model2) {
        boolean b = true;
        if (!checkNullAndSpace(sv.getId())) {
            model.addFlashAttribute("errid", "error");
            b = false;
            // flash là 1 thuộc tính
        }
        if (!checkNullAndSpace(sv.getDob())) {
            model.addFlashAttribute("errdob", "error");
            b = false;
        }
        if (!checkNullAndSpace(sv.getName())) {
            model.addFlashAttribute("errname", "error");
            b = false;
        }
        if (!checkNullAndSpace(sv.getDepartment())) {
            model.addFlashAttribute("errdep", "error");
            b = false;
        }
        if (b) {
            model2.addAttribute("sv", sv);
            return "/home/success";
            // thêm một đối tượng vào model sv, hiển thị trên trang thành công
        } else {
            return "redirect:/";
            // ít nhất 1 thông tin của SV k hợp lệ sẽ chuyển hướng về /
        }
    }

    boolean checkNullAndSpace(String s) {
        if (s == null || s.trim().equals("")) {
            return false;
        }
        return true;
    }
}
