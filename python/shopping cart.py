foods = []
prices = []
total = 0

while True:
    food = input("Enter food item(or 'q' to quit): ")
    if food.lower() == 'q':
        break
    else:
        price = float(input("Enter price of the item: RM "))
        foods.append(food)
        prices.append(price)

print("\n--- Shopping Cart ---")

for food in foods:
    print(food, end=", ")

    for price in prices:
        total += price

print(f"\nTotal Price: RM{total:.2f}")