package com.pdmtaller2.CristianParada_00107223.data

import com.pdmtaller2.CristianParada_00107223.model.Restaurant
import com.pdmtaller2.CristianParada_00107223.model.Dish



val mockRestaurant = listOf(
    // Comida Rápida
    Restaurant(
        id = 1,
        name = "McDonalds",
        description = "Hamburguesas rápidas y sabrosas",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/McDonald%27s_square_2020.svg/960px-McDonald%27s_square_2020.svg.png",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(1, "Cheeseburger", "Hamburguesa con queso y papas", "https://s7d1.scene7.com/is/image/mcdonalds/DC_202307_8936_EVM_M_BigMac_Coke_1564x1564-1:product-header-mobile?wid=1313&hei=1313&dpr=off"),
            Dish(2, "Baconburger", "Hamburguesa con tocino y papas", "https://s7d1.scene7.com/is/image/mcdonalds/DC_202307_8936_EVM_M_BigMac_Coke_1564x1564-1:product-header-mobile?wid=1313&hei=1313&dpr=off"),
            Dish(3, "Bigmac", "Hamburguesa grande", "https://s7d1.scene7.com/is/image/mcdonalds/DC_202307_8936_EVM_M_BigMac_Coke_1564x1564-1:product-header-mobile?wid=1313&hei=1313&dpr=off"),
            )
    ),
    Restaurant(
        id = 2,
        name = "Papalandia",
        description = "Todo tipo de papas fritas",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMMfKWjJv2EWLuZBKMWJosIv9wEVvmKxddyA&s",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(4, "Loaded Fries", "Papas con queso, bacon y salsa", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQA9uuZIbfgyZOyGhLjeWymEZRgoi4IpD_1RA&s"),
            Dish(5, "Crazy Fries", "Papas con queso, salchica y salsa", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQA9uuZIbfgyZOyGhLjeWymEZRgoi4IpD_1RA&s"),
            Dish(6, "Freaky Fries", "Papas con queso, jamon y salsa", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQA9uuZIbfgyZOyGhLjeWymEZRgoi4IpD_1RA&s"),
        )
    ),
    // Comida Mexicana
    Restaurant(
        id = 3,
        name = "Taco Bell",
        description = "Auténticos tacos mexicanos",
        imageUrl = "https://brandemia.org/sites/default/files/inline/images/logo_taco_bell_antes_0.jpg",
        categories = listOf("Comida Mexicana", "Comida Rápida"),
        menu = listOf(
            Dish(7, "Taco de Carnitas", "Taco con carne de cerdo", "https://www.tacobell.com.gt/images/CMB4.png"),
            Dish(8, "Taco de Al pastor", "Taco con carne de res", "https://www.tacobell.com.gt/images/CMB4.png"),
            Dish(9, "Taco de Pollo", "Taco con carne de pollo", "https://www.tacobell.com.gt/images/CMB4.png"),
        )
    ),
    Restaurant(
        id = 4,
        name = "EL Zocalo",
        description = "Sabor tradicional mexicano",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgdOgQXG34DHUS4QVnVmWp9kga9UsaEkDzBs_NvglhVpaSFm43Z9zIFdkV6G9rejSDYCQ&usqp=CAU",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(10, "Quesadilla", "Tortilla rellena de queso fundido", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRATQUid56j3U6f870xWga4kf05BWfsbIFX6w&s"),
            Dish(11, "Quesadillan`t", "Tortilla rellena sin queso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRATQUid56j3U6f870xWga4kf05BWfsbIFX6w&s"),
            Dish(12, "Quesadilla carnivora", "Tortilla rellena de queso fundido y bacon", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRATQUid56j3U6f870xWga4kf05BWfsbIFX6w&s"),
        )
    ),

    // Comida Italiana
    Restaurant(
        id = 5,
        name = "Pizza Italia",
        description = "Pastas artesanales italianas",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXI37sAlkxGGmKOvrfSf9WQMkJFlIe6sNzTA&s",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(13, "Pizza Bolognese", "Pizza con salsa de carne", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtKrjJn4QE3d0Fs19IaqyTjB-Czp36ZczEng&s"),
            Dish(14, "Pizza Margaritae", "Pasta con salsa de tomate y oregano", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtKrjJn4QE3d0Fs19IaqyTjB-Czp36ZczEng&s"),
            Dish(15, "Pizza Jamon", "Pasta con jamon", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtKrjJn4QE3d0Fs19IaqyTjB-Czp36ZczEng&s"),
        )
    ),
    Restaurant(
        id = 6,
        name = "Pizza Hut",
        description = "Pizza estilo napolitano",
        imageUrl = "https://1000marcas.net/wp-content/uploads/2020/01/Pizza-Hut-Logo-1999.jpg",
        categories = listOf("Comida Italiana","Comida Rápida"),
        menu = listOf(
            Dish(16, "Pizza Peperoni", "Pizza clásica italiana", "https://www.pizzahut.com.gt/static/media/images/images/jpg/10_11-10-2024-11-27_MD.jpg"),
            Dish(17, "Pizza Mortadela", "Pizza clásica italiana", "https://www.pizzahut.com.gt/static/media/images/images/jpg/10_11-10-2024-11-27_MD.jpg"),
            Dish(18, "Pizza Jamon", "Pizza clásica italiana", "https://www.pizzahut.com.gt/static/media/images/images/jpg/10_11-10-2024-11-27_MD.jpg"),
        )
    ),

    // Comida Asiática
    Restaurant(
        id = 7,
        name = "Kamakura",
        description = "Lo mejor del sushi japonés",
        imageUrl = "https://lirp.cdn-website.com/d4c857b7/dms3rep/multi/opt/ic-200-1920w.jpg",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(19, "Sushi Variado", "Surtido de rolls de sushi", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4VRrWp7B6Hj1Yw6cYbSqOucocUA4YXomA1g&s"),
            Dish(20, "Sushi Especial", "Surtido de rolls de sushi", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4VRrWp7B6Hj1Yw6cYbSqOucocUA4YXomA1g&s"),
            Dish(21, "Sushi de Camaron", "Surtido de rolls de sushi", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4VRrWp7B6Hj1Yw6cYbSqOucocUA4YXomA1g&s"),
        )
    ),
    Restaurant(
        id = 8,
        name = "China Wok",
        description = "Salteados asiáticos al instante",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTg71mWaO0Ncay-Q9kAs5QlpygJLJLn07SfDA&s",
        categories = listOf("Comida Asiática", "Comida Rápida"),
        menu = listOf(
            Dish(22, "Wok de Pollo", "Verduras y pollo en salsa teriyaki", "https://www.chinawok.com.sv/static/media/images/products/webp/CMB_1001_SM_17-03-2023-14-20.webp"),
            Dish(23, "Wok de Carne", "Verduras y res", "https://www.chinawok.com.sv/static/media/images/products/webp/CMB_1001_SM_17-03-2023-14-20.webp"),
            Dish(24, "Wok de Cerdo", "Verduras y cerdo", "https://www.chinawok.com.sv/static/media/images/products/webp/CMB_1001_SM_17-03-2023-14-20.webp"),
        )
    ),

    // Comida Saludable
    Restaurant(
        id = 9,
        name = "Go Green",
        description = "Comida saludable y fresca",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_pjfZIxMV-8FVdQwDu517UDrxNjnqWiQ2jw&s",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(25, "Ensalada Detox", "Ensalada de kale, quinoa y frutos secos", "https://grupogogreen.com/wp-content/uploads/2022/07/img-slide.png"),
            Dish(26, "Ensalada Tijuana", "Ensalada de pollo, jalapeño y tortilla picada", "https://grupogogreen.com/wp-content/uploads/2022/07/img-slide.png"),
            Dish(27, "Ensalada California", "Ensalada de kale, pollo, frijoles y  queso ", "https://grupogogreen.com/wp-content/uploads/2022/07/img-slide.png"),
        )
    ),
    Restaurant(
        id = 10,
        name = "Green Monkey",
        description = "Nutrición y sabor",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTZDzxr5ucLSaXZZ3QFwFFKSBAyERPP1Mjgg&s",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(28, "Bowl Proteico: Pollo", "Arroz integral, pollo y verduras", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPO73XerHBA6mMjMue76H69hirWUfvKejIAA&s"),
            Dish(29, "Bowl Proteico: Res", "Arroz integral, res y verduras", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPO73XerHBA6mMjMue76H69hirWUfvKejIAA&s"),
            Dish(30, "Bowl Proteico: Tofu", "Arroz integral, tofu y verduras", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPO73XerHBA6mMjMue76H69hirWUfvKejIAA&s"),
        )
    ),

    // Postres y Dulces
    Restaurant(
        id = 11,
        name = "llaollao",
        description = "Yogurts",
        imageUrl = "https://www.galerias.com.sv/wp-content/uploads/2021/06/LA-Logo.jpg",
        categories = listOf("Postres y Dulces", "Comida Saludable"),
        menu = listOf(
            Dish(31, "yogurt", "Yogurt regular, 2 toppings", "https://llaollao-assets.sfo3.digitaloceanspaces.com/common-files/categories/small-tarrinasv3.png"),
            Dish(32, "yogurt premium", "Yogurt grande, 3 toppings", "https://llaollao-assets.sfo3.digitaloceanspaces.com/common-files/categories/small-tarrinasv3.png"),
            Dish(33, "yogurt superpremium", "Yogurt grande, 3 toppings y 1 salsa", "https://llaollao-assets.sfo3.digitaloceanspaces.com/common-files/categories/small-tarrinasv3.png"),
        )
    ),
    Restaurant(
        id = 12,
        name = "Neveria",
        description = "Helados",
        imageUrl = "https://gardenmall.com.sv/wp-content/uploads/LaNeveria.png",
        categories = listOf("Postres y Dulces"),
        menu = listOf(
            Dish(34, "Litro de helado", "Litro de helado cualquier sabor", "https://www.laneveria.com.sv/wp-content/uploads/2017/04/1-medio-fgenerico.jpg"),
            Dish(35, "Brownie especial", "Brownie con helado", "https://www.laneveria.com.sv/wp-content/uploads/2017/04/1-medio-fgenerico.jpg"),
            Dish(36, "Cono Waffle", "Helado con cono de waffle y cubierta de chocolate", "https://www.laneveria.com.sv/wp-content/uploads/2017/04/1-medio-fgenerico.jpg"),
        )
    ),

    // Bebidas
    Restaurant(
        id = 13,
        name = "Smoothies Factory",
        description = "Jugos naturales y smoothies",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRM8Q6Y4OhIN9dCxms2r1bTP1ziSptKs068Ug&s",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(37, "Smoothie de Tropical", "Mango, plátano y leche de almendra", "https://smoothiefactory.net/wp-content/uploads/2018/10/products1.png"),
            Dish(38, "Smoothie de Bananero", ", plátano y leche de almendra", "https://smoothiefactory.net/wp-content/uploads/2018/10/products1.png"),
            Dish(39, "Smoothie Fit", "Ciruela, papaya y leche", "https://smoothiefactory.net/wp-content/uploads/2018/10/products1.png"),
        )
    ),
    Restaurant(
        id = 14,
        name = "Starbucks",
        description = "Café de especialidad",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6Adp552TXE1OVHuoe6mWIaD6FgzwfqFzgHg&s",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(40, "Latte", "Café con leche espumosa", "https://starbuckspr.com/wp-content/uploads/2022/12/Chai-Latte-768x768-1.jpg"),
            Dish(41, "Cafe negro", "Café", "https://starbuckspr.com/wp-content/uploads/2022/12/Chai-Latte-768x768-1.jpg"),
            Dish(42, "Cappuccino", "Café con crema", "https://starbuckspr.com/wp-content/uploads/2022/12/Chai-Latte-768x768-1.jpg"),
        )
    )
)