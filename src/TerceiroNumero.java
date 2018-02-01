
public class TerceiroNumero {

	/**
	 * Método que gera o terceiro número baseado na seguinte regras:
	 * 
	 * - O primeiro número de C é o primeiro número de A; 
	 * - O segundo número de C é o primeiro número de B; 
	 * - O terceiro número de C é o segundo número de A; 
	 * - O quarto número de C é o segundo número de B; 
	 * Assim
	 * sucessivamente... 
	 * 
	 * - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos números do inteiro maior.
	 *  Ex:
	 * A = 10256, B = 512, C deve ser 15012256. - Caso C seja maior que
	 * 1.000.000, retornar -1
	 * 
	 * 
	 * @param primeiro
	 * @param segundo
	 * @return
	 */
	public static int geraTerceiroNumero(int primeiro, int segundo) {

		String stringA = String.valueOf(primeiro);
		String stringB = String.valueOf(segundo);
		StringBuffer stringC = new StringBuffer();
		String maiorString = "";
		String menorString = "";
		String resto = null;
		if (stringA.length() != stringB.length()) {
			menorString = (stringA.length() < stringB.length() ? stringA : stringB);
			maiorString = (stringA.length() > stringB.length() ? stringA : stringB);
			resto = maiorString.substring(menorString.length());
		} else {
			maiorString = stringA;
		}

		for (int i = 0; i < menorString.length(); i++) {

			if (i % 2 == 0) {
				stringC.append(stringA.charAt(i));
				stringC.append(stringB.charAt(i));
			} else {
				stringC.append(stringA.charAt(i));
				stringC.append(stringB.charAt(i));
			}
		}

		int c = Integer.valueOf(stringC.toString() + (resto != null ? resto : ""));
		return (c > 1000000 ? -1 : c);
	}

	public static void main(String[] args) {

		System.out.println(geraTerceiroNumero(10256, 512));
	}
}
