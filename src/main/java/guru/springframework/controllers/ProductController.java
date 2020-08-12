package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Donald F. Coffin
 */
@Controller
public class ProductController {

	public String getProduct() {

		return "product";
	}
}
