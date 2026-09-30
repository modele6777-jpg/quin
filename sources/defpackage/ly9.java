package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ly9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public ly9(int i, int i2) {
        this.a = Color.red(i);
        this.b = Color.green(i);
        this.c = Color.blue(i);
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        int i = this.d;
        int iE = v82.e(4.5f, -1, i);
        int iE2 = v82.e(3.0f, -1, i);
        if (iE != -1 && iE2 != -1) {
            this.h = v82.h(-1, iE);
            this.g = v82.h(-1, iE2);
            this.f = true;
            return;
        }
        int iE3 = v82.e(4.5f, -16777216, i);
        int iE4 = v82.e(3.0f, -16777216, i);
        if (iE3 == -1 || iE4 == -1) {
            this.h = iE != -1 ? v82.h(-1, iE) : v82.h(-16777216, iE3);
            this.g = iE2 != -1 ? v82.h(-1, iE2) : v82.h(-16777216, iE4);
            this.f = true;
        } else {
            this.h = v82.h(-16777216, iE3);
            this.g = v82.h(-16777216, iE4);
            this.f = true;
        }
    }

    public final float[] b() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = new float[3];
            this.i = fArr;
        }
        v82.a(this.a, this.b, this.c, fArr);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ly9.class == obj.getClass()) {
            ly9 ly9Var = (ly9) obj;
            if (this.e == ly9Var.e && this.d == ly9Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ly9.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
