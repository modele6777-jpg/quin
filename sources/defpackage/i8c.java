package defpackage;

import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i8c implements ky4, f21, yrd, ong, jl, vu3, tc0, wc0, xx0, s61, g2f, bn2, ejb, hec {
    public static final i8c b = new i8c(0);
    public static final i8c c = new i8c(1);
    public static final i8c d = new i8c(2);
    public static final i8c e = new i8c(3);
    public static final i8c f = new i8c(4);
    public static final i8c g = new i8c(5);
    public static final cva v = new cva(23);
    public static final cva w = new cva(24);
    public static final i8c x = new i8c(7);
    public static final i8c y = new i8c(8);
    public static final i8c z = new i8c(9);
    public final /* synthetic */ int a;

    public /* synthetic */ i8c(int i) {
        this.a = i;
    }

    public static sp1 o(l46 l46Var) {
        boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
        boolean zS = g21.S(l46Var);
        if (zF) {
            return sp1.NEO;
        }
        return zS ? sp1.Light : sp1.Dark;
    }

    @Override // defpackage.yrd
    public boolean N(Object obj, Object obj2) {
        return pa7.t(obj, obj2);
    }

    @Override // defpackage.vu3
    public boolean a(SSLSocket sSLSocket) {
        return c5e.C(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.vu3
    public ssd b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                ho7.t(cls, "No OpenSSLSocketImpl superclass of socket of type ");
                return null;
            }
        }
        return new hv(superclass);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x00da  */
    /* JADX WARN: Code duplicated, block: B:92:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00d1 A[SYNTHETIC] */
    @Override // defpackage.hec
    public q68 d(CharSequence charSequence, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        char cCharAt;
        boolean z4;
        int i6 = -1;
        boolean z5 = true;
        for (int i7 = i - 1; i7 >= i2; i7--) {
            char cCharAt2 = charSequence.charAt(i7);
            if ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < 'a' || cCharAt2 > 'z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 >= 128 || cCharAt2 == '!' || cCharAt2 == '-' || cCharAt2 == '/' || cCharAt2 == '=' || cCharAt2 == '?' || cCharAt2 == '*' || cCharAt2 == '+'))) {
                switch (cCharAt2) {
                    default:
                        switch (cCharAt2) {
                            default:
                                switch (cCharAt2) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        break;
                                    default:
                                        if (cCharAt2 == '.' && !z5) {
                                            z5 = true;
                                        }
                                        break;
                                }
                            case '^':
                            case '_':
                            case '`':
                                i6 = i7;
                                z5 = false;
                                continue;
                        }
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                        i6 = i7;
                        z5 = false;
                        continue;
                }
                if (i6 == -1) {
                    return null;
                }
                i3 = i + 1;
                z2 = false;
                z3 = true;
                i4 = -1;
                i5 = -1;
                while (i3 < charSequence.length()) {
                    cCharAt = charSequence.charAt(i3);
                    if (z3) {
                        if ((cCharAt >= 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt < 128))) {
                            if (i4 != -1 || i4 > i5) {
                                i5 = -1;
                            }
                            if (i5 == -1) {
                                return null;
                            }
                            return new q68(s68.b, i6, i5 + 1);
                        }
                        z3 = false;
                        z4 = true;
                    } else if (cCharAt == '.') {
                        if (!z2) {
                            if (i4 != -1) {
                                i5 = -1;
                            } else {
                                i5 = -1;
                            }
                            if (i5 == -1) {
                                return null;
                            }
                            return new q68(s68.b, i6, i5 + 1);
                        }
                        z3 = true;
                        if (i4 == -1) {
                            z4 = z2;
                            i3 = i5;
                            i4 = i3;
                        } else {
                            i3 = i5;
                            i4 = i4;
                            z4 = z2;
                        }
                    } else if (cCharAt == '-') {
                        i3 = i5;
                        i4 = i4;
                        z4 = false;
                    } else {
                        if ((cCharAt >= 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < '0' || cCharAt > '9'))) {
                            if (cCharAt < 128) {
                                if (i4 != -1) {
                                    i5 = -1;
                                } else {
                                    i5 = -1;
                                }
                                if (i5 == -1) {
                                    return null;
                                }
                                return new q68(s68.b, i6, i5 + 1);
                            }
                        }
                        z4 = true;
                    }
                    i3++;
                    z2 = z4;
                    i4 = i4;
                    i5 = i3;
                }
                if (i4 != -1) {
                    i5 = -1;
                } else {
                    i5 = -1;
                }
                if (i5 == -1) {
                    return null;
                }
                return new q68(s68.b, i6, i5 + 1);
            }
            i6 = i7;
            z5 = false;
            continue;
        }
        if (i6 == -1) {
            return null;
        }
        i3 = i + 1;
        z2 = false;
        z3 = true;
        i4 = -1;
        i5 = -1;
        while (i3 < charSequence.length()) {
            cCharAt = charSequence.charAt(i3);
            if (z3) {
                if (cCharAt >= 'A') {
                    if (i4 != -1) {
                        i5 = -1;
                    } else {
                        i5 = -1;
                    }
                    if (i5 == -1) {
                        return null;
                    }
                    return new q68(s68.b, i6, i5 + 1);
                }
                if (i4 != -1) {
                    i5 = -1;
                } else {
                    i5 = -1;
                }
                if (i5 == -1) {
                    return null;
                }
                return new q68(s68.b, i6, i5 + 1);
                z3 = false;
                z4 = true;
            } else if (cCharAt == '.') {
                if (!z2) {
                    if (i4 != -1) {
                        i5 = -1;
                    } else {
                        i5 = -1;
                    }
                    if (i5 == -1) {
                        return null;
                    }
                    return new q68(s68.b, i6, i5 + 1);
                }
                z3 = true;
                if (i4 == -1) {
                    z4 = z2;
                    i3 = i5;
                    i4 = i3;
                } else {
                    i3 = i5;
                    i4 = i4;
                    z4 = z2;
                }
            } else if (cCharAt == '-') {
                i3 = i5;
                i4 = i4;
                z4 = false;
            } else {
                if (cCharAt >= 'A') {
                    if (cCharAt < 128) {
                        if (i4 != -1) {
                            i5 = -1;
                        } else {
                            i5 = -1;
                        }
                        if (i5 == -1) {
                            return null;
                        }
                        return new q68(s68.b, i6, i5 + 1);
                    }
                } else if (cCharAt < 128) {
                    if (i4 != -1) {
                        i5 = -1;
                    } else {
                        i5 = -1;
                    }
                    if (i5 == -1) {
                        return null;
                    }
                    return new q68(s68.b, i6, i5 + 1);
                }
                z4 = true;
            }
            i3++;
            z2 = z4;
            i4 = i4;
            i5 = i3;
        }
        if (i4 != -1) {
            i5 = -1;
        } else {
            i5 = -1;
        }
        if (i5 == -1) {
            return null;
        }
        return new q68(s68.b, i6, i5 + 1);
    }

    @Override // defpackage.ong
    public boolean e(Class cls) {
        return omg.class.isAssignableFrom(cls);
    }

    @Override // defpackage.tc0, defpackage.wc0
    public float f() {
        return 0.0f;
    }

    @Override // defpackage.ky4
    public void g(u09 u09Var, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + u09Var.getName() + ", unresolved classes " + arrayList);
    }

    @Override // defpackage.ejb, defpackage.prf
    public tt7 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.s61
    public byte[] h(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.ky4
    public void i(ea1 ea1Var) {
        throw new IllegalStateException("Cannot infer visibility for " + ea1Var);
    }

    @Override // defpackage.f21
    public long j(guc gucVar, int i) {
        String str = gucVar.f.a.a.b;
        return u3c.b(xdc.n(str, i), xdc.m(str, i));
    }

    @Override // defpackage.bn2
    public long k(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i = cec.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.ong
    public xng l(Class cls) {
        if (!omg.class.isAssignableFrom(cls)) {
            qc0.j("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (xng) omg.l(cls.asSubclass(omg.class)).q(3);
        } catch (Exception e2) {
            cva.q("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // defpackage.tc0
    public void m(sw3 sw3Var, int i, int[] iArr, cv7 cv7Var, int[] iArr2) {
        if (cv7Var == cv7.a) {
            xc0.a(i, iArr, iArr2, false);
        } else {
            xc0.a(i, iArr, iArr2, true);
        }
    }

    public void n(j09 j09Var, float f2, long j, l46 l46Var, int i, int i2) {
        float f3;
        long j2;
        float f4;
        long jD;
        l46Var.h0(-1498258020);
        int i3 = i | (l46Var.g(j09Var) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= l46Var.d(f2) ? 32 : 16;
        }
        int i5 = i3 | (((i2 & 4) == 0 && l46Var.f(j)) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i5 & 1, (i5 & 147) != 146)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                f4 = i4 != 0 ? bua.b : f2;
                if ((i2 & 4) != 0) {
                    jD = o82.d(bua.a, l46Var);
                }
                l46Var.s();
                s21.a(tm7.o(b.d(b.c(j09Var, 1.0f), f4), jD, g21.f), l46Var, 0);
                f3 = f4;
                j2 = jD;
            } else {
                l46Var.Z();
                f4 = f2;
            }
            jD = j;
            l46Var.s();
            s21.a(tm7.o(b.d(b.c(j09Var, 1.0f), f4), jD, g21.f), l46Var, 0);
            f3 = f4;
            j2 = jD;
        } else {
            l46Var.Z();
            f3 = f2;
            j2 = j;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s11(this, j09Var, f3, j2, i, i2);
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "SingleLineCodepointTransformation";
            case 4:
                return "StructuralEqualityPolicy";
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "Arrangement#Center";
            case 19:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.wc0
    public void w(sw3 sw3Var, int i, int[] iArr, int[] iArr2) {
        xc0.a(i, iArr, iArr2, false);
    }

    @Override // defpackage.xx0
    public long c(long j) {
        return j;
    }
}
