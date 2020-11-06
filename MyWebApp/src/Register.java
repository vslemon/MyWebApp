
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int barcode = Integer.parseInt(req.getParameter("barcode"));
		String name = req.getParameter("name");
		String color = req.getParameter("color");
		String desc = req.getParameter("desc");

		Product product = new Product(barcode, name, color, desc);

		ProductDao rDao = new ProductDao();
		String result = rDao.register(product);

		req.setAttribute("barcode", barcode);
		req.setAttribute("name", name);
		req.setAttribute("color", color);
		req.setAttribute("desc", desc);

		if (result.equals("ok")) {
			req.getRequestDispatcher("product.jsp").forward(req, res);
		} else {
			req.getRequestDispatcher("fail.jsp").forward(req, res);;
		}

	}

}
