package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fv8 extends ay0 {
    public static final fv8 g;
    public static final fv8 h;
    public final boolean f;

    static {
        fv8 fv8Var = new fv8(new int[]{2, 4, 0}, false);
        g = fv8Var;
        int i = fv8Var.c;
        int i2 = fv8Var.b;
        h = (i2 == 1 && i == 9) ? new fv8(new int[]{2, 0, 0}, false) : new fv8(new int[]{i2, i + 1, 0}, false);
        new fv8(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv8(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f = z;
    }
}
