package io.springbatch.springbatchlecture.batch.chunk.processor;

import org.springframework.batch.item.ItemProcessor;

import io.springbatch.springbatchlecture.batch.domain.Product;
import io.springbatch.springbatchlecture.batch.domain.ProductVO;

public class FileItemProcessor implements ItemProcessor<ProductVO, Product> {

	@Override
	public Product process(ProductVO productVO) throws Exception {
		return null;
	}
}
