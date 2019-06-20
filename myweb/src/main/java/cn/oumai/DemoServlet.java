package cn.oumai;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet{
	public String test() {
		return null;
	}
}
