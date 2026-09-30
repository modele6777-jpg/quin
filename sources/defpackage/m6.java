package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 extends j6 {
    public static m6 c;

    @Override // defpackage.j6
    public final int[] h(int i) {
        int length = l().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && l().charAt(i) == '\n' && (l().charAt(i) == '\n' || (i != 0 && l().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !y(i2)) {
            i2++;
        }
        return k(i, i2);
    }

    @Override // defpackage.j6
    public final int[] s(int i) {
        int length = l().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && l().charAt(i - 1) == '\n' && !y(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (l().charAt(i2) == '\n' || (i2 != 0 && l().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return k(i2, i);
    }

    public final boolean y(int i) {
        if (i <= 0 || l().charAt(i - 1) == '\n') {
            return false;
        }
        return i == l().length() || l().charAt(i) == '\n';
    }
}
