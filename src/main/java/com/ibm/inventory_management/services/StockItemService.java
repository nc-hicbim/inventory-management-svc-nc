package com.ibm.inventory_management.services;

import static java.util.Arrays.asList;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ibm.inventory_management.models.StockItem;

@Service
public class StockItemService implements StockItemApi {
    @Override
    public List<StockItem> listStockItems() {
        return asList(
                new StockItem("1")
                        .withName("Item 1")
                        .withStock(100)
                        .withPrice(10.5)
                        .withManufacturer("Sony"),
                new StockItem("2")
                        .withName("Item 2")
                        .withStock(150)
                        .withPrice(100.0)
                        .withManufacturer("Insignia"),
                new StockItem("3")
                        .withName("Item 3")
                        .withStock(10)
                        .withPrice(1000.0)
                        .withManufacturer("Panasonic"),
                new StockItem("34")
                        .withName("Thirty4")
                        .withStock(34)
                        .withPrice(34.0)
                        .withManufacturer("Aperture Labs"),
                new StockItem("Seven")
                        .withName("Name Seven")
                        .withStock(7000)
                        .withPrice(7000000.0)
                        .withManufacturer("Seventh Day"),
                new StockItem("One More")
                        .withName("Just One")
                        .withStock(1)
                        .withPrice(1)
                        .withManufacturer("And 1")
        );
    }
}
