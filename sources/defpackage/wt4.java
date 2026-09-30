package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wt4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public Object f;
    public Object g;

    public wt4(gkg gkgVar, Object[] objArr, StringBuilder sb) {
        this.a = 2;
        this.b = 0;
        this.c = -1;
        drb.n(gkgVar, "context");
        this.e = gkgVar;
        this.d = 0;
        this.f = objArr;
        this.g = sb;
    }

    public static void h(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(bhh.a(obj));
        sb.append("]");
    }

    public void a() {
        this.b = 1;
        this.f = (dv8) this.e;
        this.d = 0;
    }

    public boolean b() {
        av8 av8VarB = ((dv8) this.f).b.b();
        int iB = av8VarB.b(6);
        return !(iB == 0 || ((ByteBuffer) av8VarB.d).get(iB + av8VarB.a) == 0) || this.c == 65039;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        HashMap map = ((pfh) this.g).d;
        int[] iArr = (int[]) this.e;
        pfh pfhVar = (pfh) map.get(Integer.valueOf(iArr[this.b]));
        while (true) {
            int i = (pfhVar.b - pfhVar.a) + 1;
            int i2 = this.c;
            if (i > i2) {
                return;
            }
            int i3 = this.b + i;
            this.b = i3;
            this.g = pfhVar;
            int i4 = i2 - i;
            this.c = i4;
            if (i4 > 0) {
                pfhVar = (pfh) pfhVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public void d() {
        pfh pfhVar = ((pfh) this.g).c;
        if (pfhVar != null) {
            this.g = pfhVar;
        } else {
            this.g = (pfh) this.f;
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
            }
            if (this.d > 0) {
                this.b++;
            }
        }
        c();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:64:0x0096  */
    public void e(Object obj, xgh xghVar, ygh yghVar) {
        String simpleName;
        ygh yghVar2;
        boolean zIsValidCodePoint;
        StringBuilder sb = (StringBuilder) this.g;
        int iOrdinal = xghVar.c().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                h(sb, obj, xghVar.e());
                return;
            }
        }
        int iOrdinal2 = xghVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (yghVar.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5) {
                        if (yghVar.a()) {
                            yghVar2 = yghVar;
                        } else {
                            int i = yghVar.a;
                            int i2 = i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            if (i2 == 0) {
                                yghVar2 = ygh.e;
                            } else if (i2 == i && yghVar.b == -1 && yghVar.c == -1) {
                                yghVar2 = yghVar;
                            } else {
                                yghVar2 = new ygh(i2, -1, -1);
                            }
                        }
                        if (yghVar2.equals(yghVar)) {
                            Number number = (Number) obj;
                            Locale locale = bhh.a;
                            boolean zC = yghVar.c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                bhh.b(sb, jLongValue, zC);
                                return;
                            }
                            if (number instanceof Integer) {
                                bhh.b(sb, jLongValue & 4294967295L, zC);
                                return;
                            }
                            if (number instanceof Byte) {
                                bhh.b(sb, jLongValue & 255, zC);
                                return;
                            }
                            if (number instanceof Short) {
                                bhh.b(sb, jLongValue & 65535, zC);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                qc0.p("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string = ((BigInteger) number).toString(16);
                            if (zC) {
                                string = string.toUpperCase(bhh.a);
                            }
                            sb.append(string);
                            return;
                        }
                    }
                } else if (yghVar.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (yghVar.a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = bhh.a;
                int i3 = yghVar.a;
                int i4 = i3 & 162;
                if (i4 != 0) {
                    i4 = ((i3 & 32) == 0 ? 0 : 1) | ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 2 : 0) | ((i3 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, bhh.a);
                try {
                    formattable.formatTo(formatter, i4, yghVar.b, yghVar.c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(bhh.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (yghVar.a()) {
                sb.append(bhh.a(obj));
                return;
            }
        }
        String strE = xghVar.e();
        if (!yghVar.a()) {
            int iB = xghVar.b();
            if (yghVar.c()) {
                iB &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            yghVar.d(sb2);
            sb2.append((char) iB);
            strE = sb2.toString();
        }
        sb.append(String.format(bhh.a, strE, obj));
    }

    public void f(pfh pfhVar, StringBuilder sb) {
        for (pfh pfhVar2 : pfhVar.d.values()) {
            sb.append("  ");
            sb.append(pfhVar);
            sb.append(" -> ");
            sb.append(pfhVar2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, pfhVar2.a, Math.min(iArr.length, pfhVar2.b + 1))));
            sb.append("\"]\n");
            f(pfhVar2, sb);
        }
    }

    public boolean g(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("digraph {\n");
                f((pfh) this.f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public wt4(int[] iArr) {
        this.a = 1;
        this.e = iArr;
        pfh pfhVar = new pfh(-1, -1);
        this.f = pfhVar;
        this.g = pfhVar;
    }

    public wt4(dv8 dv8Var) {
        this.a = 0;
        this.b = 1;
        this.e = dv8Var;
        this.f = dv8Var;
    }
}
