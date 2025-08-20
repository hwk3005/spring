package com.site.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Board {
	
	private String bno;
	private String btitle;
	private String id;
	private String bdate;
	private String bhit;
	
}
