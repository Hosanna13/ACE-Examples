## Keep in Mind for Main
1. Import XML FIle from RSS Url
2. Create XML Tree
3. Check if XML Tree is  a vaild rss feed

**IF VALID:**
4. Create Chanel XML Tree 
5. Write Header using `outputHeader`
6. For Each Item, within the number of children of child call `processItem`
7. Write the Footer using `outputFooter`

**IF NOT VALID:**
4. Print "Invalid RSS Code" 