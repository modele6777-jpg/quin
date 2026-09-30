package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l9c implements Cloneable {
    public final float a;
    public final int b;

    public l9c(float f) {
        this.a = f;
        this.b = 1;
    }

    public final float a() {
        float f;
        float f2;
        int iB = kv2.B(this.b);
        float f3 = this.a;
        if (iB == 0) {
            return f3;
        }
        if (iB == 3) {
            return f3 * 96.0f;
        }
        if (iB == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (iB == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (iB == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (iB != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float b(hbc hbcVar) {
        if (this.b != 9) {
            return d(hbcVar);
        }
        ebc ebcVar = (ebc) hbcVar.c;
        v79 v79Var = ebcVar.g;
        if (v79Var == null) {
            v79Var = ebcVar.f;
        }
        float f = this.a;
        if (v79Var == null) {
            return f;
        }
        float fSqrt = v79Var.d;
        float f2 = v79Var.e;
        if (fSqrt != f2) {
            fSqrt = (float) (Math.sqrt((f2 * f2) + (fSqrt * fSqrt)) / 1.414213562373095d);
        }
        return (f * fSqrt) / 100.0f;
    }

    public final float c(hbc hbcVar, float f) {
        return this.b == 9 ? (this.a * f) / 100.0f : d(hbcVar);
    }

    public final float d(hbc hbcVar) {
        float textSize;
        int iB = kv2.B(this.b);
        float f = this.a;
        switch (iB) {
            case 1:
                textSize = ((ebc) hbcVar.c).d.getTextSize();
                break;
            case 2:
                textSize = ((ebc) hbcVar.c).d.getTextSize() / 2.0f;
                break;
            case 3:
                hbcVar.getClass();
                return f * 96.0f;
            case 4:
                hbcVar.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                hbcVar.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                hbcVar.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                hbcVar.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                ebc ebcVar = (ebc) hbcVar.c;
                v79 v79Var = ebcVar.g;
                if (v79Var == null) {
                    v79Var = ebcVar.f;
                }
                if (v79Var != null) {
                    return (f * v79Var.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float e(hbc hbcVar) {
        if (this.b != 9) {
            return d(hbcVar);
        }
        ebc ebcVar = (ebc) hbcVar.c;
        v79 v79Var = ebcVar.g;
        if (v79Var == null) {
            v79Var = ebcVar.f;
        }
        float f = this.a;
        return v79Var == null ? f : (f * v79Var.e) / 100.0f;
    }

    public final boolean f() {
        return this.a < 0.0f;
    }

    public final boolean g() {
        return this.a == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.a));
        switch (this.b) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public l9c(int i, float f) {
        this.a = f;
        this.b = i;
    }
}
