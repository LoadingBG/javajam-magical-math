class CursedPrintf {
    public static void main(String[] args) {
        System.out.println("Look how many characters are there in the file :)");
        System.out.println("2 + 2 = " + magic(2 + 2));
        System.out.printf("2 + 2 = %d", magic(2 + 2));
    }
    private static int magic(int val) {
        try {
            System.err.close();
            java.lang.reflect.Field field = Integer.class.getDeclaredClasses()[0].getDeclaredField("cache");
            field.setAccessible(true);
            Integer[] cache = (Integer[]) field.get(null);
            cache[128 + val] = cache[129 + val];
        } catch (Exception e) {}
        return val;
    }
}
