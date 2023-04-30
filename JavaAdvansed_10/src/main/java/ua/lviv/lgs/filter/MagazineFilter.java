package ua.lviv.lgs.filter;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

import ua.lviv.lgs.domain.UserRole;
import ua.lviv.lgs.shared.FilterService;


@WebFilter("/magazine")
public class MagazineFilter implements Filter {
	private FilterService filterService = FilterService.getFilterService();
	
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		filterService.doFilterValidation(request, response, chain, Arrays.asList(UserRole.USER));
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}
}