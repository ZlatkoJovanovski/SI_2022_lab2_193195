# SI_2022_lab2_193195

Zlatko Jovanovski 193195

2.CFG

![silab2javaphoto](https://user-images.githubusercontent.com/102656383/171868495-b5cb2aeb-479e-4c06-b47c-91b4547ca3ef.jpg)
![silab2dijagram](https://user-images.githubusercontent.com/102656383/171868544-e27eadfc-c185-408d-a86c-f34f391b1ad4.png)

3. Цикломатската комплексност е 9 и до неа стигнав преку формулата V(G)=P+1, каде што P е бројот на јазли во кои се донесува одлука, односно во овој случај кога се извршуваат сите if-ови и едниот for кои се присутни во нашиот код. Со нивното броење добиваме P=8 и на оваа вредност според формулата се додава 1 со што ја добиваме цикломатската комплексност.

4. Сите тест случаи според Every Statement критериумот:

   ![EVERY STATEMENT](https://user-images.githubusercontent.com/102656383/171881240-d1870c99-286c-4c56-bfc5-ed02033544fe.jpg)

   Прв тест случај: Се внесува празна листа. Со првиот тест случај ги изминуваме A, B и X. При овој тест случај во A се утврдува дека големината на внесената листа е помала од 0, со што преминува на B и се фрла соодветниот Exception.
   
   Втор тест случај: Се внесува листата [#,0,#]. Со вториот тест случај се изминуваат A, CDE, F и X. При овој тест случај во A се утврдува дека големината на внесената листа е поголема од 0, и продолжува на CDE, каде се утврдува дека внесената листа не претставува перфектен квадрат со што се преминува на F и се фрла соодветниот Exception. 
   
   Трет тест случај: Се внесува листата ["0", "#", "0", "0", "0", "#", "0", "#", "#"]. Со третиот тест случај се изминуваат A, CDE, G, H, H1, H2, I, J, K , L, M, N, O, P, Q, R, S, T, U, V, W и X. При овој тест случај во A се утврдува дека големината на внесената листа е поголема од 0, и продолжува на CDE, каде се утврдува дека внесената листа претставува перфектен квадрат со што се преминува на G, и така редоследно како што е претставено на дијаграмот погоре се поминуваат останатите јазли.  

5. Сите тест случаи според Every Branch критериумот:

![EVERY BRANCH](https://user-images.githubusercontent.com/102656383/171904129-a920f921-bcc2-49b9-8634-eb78ecb07922.jpg)

   Прв тест случај: Се внесува празна листа. Со првиот тест случај ги изминуваме гранките A - B и B - X. При овој тест случај во A се утврдува дека големината на внесената листа е помала од 0, со што преминува на B и се фрла соодветниот Exception.
   
   Втор тест случај: Се внесува листата [#,0,#]. Со вториот тест случај се изминуваат гранките A - CDE, CDE - F и F - X. При овој тест случај во A се утврдува дека големината на внесената листа е поголема од 0, и продолжува на CDE, каде се утврдува дека внесената листа не претставува перфектен квадрат со што се преминува на F и се фрла соодветниот Exception. 
   
   Трет тест случај: Се внесува листата ["0", "#", "0", "0", "0", "#", "0", "#", "#"]. Со третиот тест случај се изминуваат A - CDE, CDE - G, G - H, H - H1, H1 - W, W - X, H1 - I, I - U, U - V , V - H2, H2 - H1, I - J, J - K, K - P, K - L, L - M, L - N, M - P, N - O, O - P, P - Q, P - R, Q - R, R - S, R - T, S - T и T - H2. При овој тест случај во A се утврдува дека големината на внесената листа е поголема од 0, и продолжува на CDE, каде се утврдува дека внесената листа претставува перфектен квадрат со што се преминува на G, и така редоследно како што е претставено на дијаграмот погоре се поминуваат останатите јазли.
