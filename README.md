# EDI & EDIFACT Message Generator GUI

A desktop application built with **Java Swing** to help learn and simulate **Electronic Data Interchange (EDI)** and **EDIFACT** message creation.

---

## Features

- **User Input:** Enter Purchase Order (PO) Number, Product Code, and Quantity
- **EDIFACT ORDERS Message Generation:** Creates a valid EDIFACT ORDERS message
- **Display:** Shows the generated message in a TextArea
- **Save to File:** Saves the message to `order.edi`
- **Validation:** Prevents empty or invalid entries for required fields

---

## What are EDI and EDIFACT?

- **EDI (Electronic Data Interchange):** Electronic transfer of business data between companies, eliminating manual intervention.
- **EDIFACT:** International (ISO) standard format for EDI messages, structured with segments like UNH, BGM, DTM, NAD, LIN, QTY.

---

## How to Use

1. Enter **PO Number**, **Product Code**, and **Quantity**
2. Click **"Generate Message"**
3. The EDIFACT message appears in the TextArea and is saved as `order.edi`

### Example Output

```
UNH+1+ORDERS:D:96A:UN'
BGM+220+PO12345+9'
DTM+137:20250903:102'
NAD+BY+123456789::16'
LIN+1++PRD001:IN'
QTY+21:10'
```

---

## Adapting for Mobile (Swift Example)

This project can be adapted for **iOS using Swift**, keeping the same logic:

- User enters PO Number, Product Code, Quantity
- App generates and displays EDIFACT message
- Optionally save or share the message via mobile storage

---

## Requirements

- **Java 17+**
- **IntelliJ IDEA** or **Eclipse** (for GUI development)
- Basic Java and Swing knowledge

---

## License

MIT License

---

**Learn, experiment, and simulate EDI & EDIFACT message creation!**