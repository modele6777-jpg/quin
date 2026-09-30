package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uyf implements f8e {
    public static final w03 e;
    public final d0a a = new d0a();
    public final d0a b = new d0a();
    public final tyf c;
    public Inflater d;

    static {
        ey6 ey6Var = jy6.b;
        e = new w03(-9223372036854775807L, -9223372036854775807L, yob.e);
    }

    public uyf(List list) {
        int i;
        tyf tyfVar = new tyf();
        this.c = tyfVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = pqf.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                tyfVar.f = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = tyfVar.f;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        xo1.W("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    xo1.V("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        tyfVar.g = Integer.parseInt(strArrSplit2[0]);
                        tyfVar.h = Integer.parseInt(strArrSplit2[1]);
                        tyfVar.d = true;
                    } catch (RuntimeException e3) {
                        xo1.W("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x028c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0292  */
    /* JADX WARN: Code duplicated, block: B:106:0x0298  */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:95:0x027f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00c9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.f8e
    public final void s(byte[] bArr, int i, int i2, e8e e8eVar, xl2 xl2Var) {
        w03 w03Var;
        char c;
        long j;
        char c2;
        t03 t03Var;
        long j2;
        long j3;
        yob yobVarS;
        long j4;
        Rect rect;
        d0a d0aVar = this.a;
        d0aVar.K(bArr, i + i2);
        d0aVar.M(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        String str = pqf.a;
        if (d0aVar.a() > 0 && d0aVar.j() == 120) {
            d0a d0aVar2 = this.b;
            if (pqf.C(d0aVar, d0aVar2, inflater)) {
                d0aVar.K(d0aVar2.a, d0aVar2.c);
            }
        }
        tyf tyfVar = this.c;
        long j5 = -9223372036854775807L;
        tyfVar.b = -9223372036854775807L;
        tyfVar.c = -9223372036854775807L;
        char c3 = 0;
        tyfVar.e = false;
        tyfVar.i = null;
        tyfVar.j = -1;
        tyfVar.k = -1;
        int iA = d0aVar.a();
        if (iA < 2 || d0aVar.G() != iA) {
            w03Var = e;
        } else {
            if (tyfVar.f == null) {
                xo1.V("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (tyfVar.d) {
                    int i3 = d0aVar.b - 2;
                    d0aVar.M(d0aVar.G() + i3);
                    while (true) {
                        if (d0aVar.a() < 4) {
                            j = j5;
                            c2 = c3;
                            c = c2;
                        } else {
                            int i4 = d0aVar.b;
                            int iG = d0aVar.G() * 10000;
                            int iG2 = d0aVar.G() + i3;
                            c = (iG2 == i4 || iG2 >= d0aVar.c) ? c3 : (char) 1;
                            int i5 = c != 0 ? iG2 : d0aVar.c;
                            j = j5;
                            char c4 = 1;
                            while (d0aVar.b < i5 && c4 != 0) {
                                long j6 = iG;
                                int[] iArr = tyfVar.a;
                                char c5 = c3;
                                int iZ = d0aVar.z();
                                if (iZ != 255) {
                                    switch (iZ) {
                                        case 0:
                                            c4 = 1;
                                            break;
                                        case 1:
                                            tyfVar.b = j6;
                                            c4 = 1;
                                            break;
                                        case 2:
                                            tyfVar.c = j6;
                                            c4 = 1;
                                            break;
                                        case 3:
                                            if (d0aVar.a() >= 2) {
                                                int iZ2 = d0aVar.z();
                                                int iZ3 = d0aVar.z();
                                                iArr[3] = tyf.a(tyfVar.f, iZ2 >> 4);
                                                iArr[2] = tyf.a(tyfVar.f, iZ2 & 15);
                                                iArr[1] = tyf.a(tyfVar.f, iZ3 >> 4);
                                                iArr[c5] = tyf.a(tyfVar.f, iZ3 & 15);
                                                tyfVar.e = true;
                                                c4 = 1;
                                            } else {
                                                xo1.V("VobsubParser", "Incomplete color command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 4:
                                            if (d0aVar.a() < 2) {
                                                xo1.V("VobsubParser", "Incomplete alpha command");
                                            } else if (tyfVar.e) {
                                                int iZ4 = d0aVar.z();
                                                int iZ5 = d0aVar.z();
                                                iArr[3] = tyf.c(iArr[3], iZ4 >> 4);
                                                iArr[2] = tyf.c(iArr[2], iZ4 & 15);
                                                iArr[1] = tyf.c(iArr[1], iZ5 >> 4);
                                                iArr[c5] = tyf.c(iArr[c5], iZ5 & 15);
                                                c4 = 1;
                                            } else {
                                                xo1.V("VobsubParser", "Ignoring alpha command before color command");
                                            }
                                            c4 = c5;
                                            break;
                                        case 5:
                                            if (d0aVar.a() >= 6) {
                                                int iZ6 = d0aVar.z();
                                                int iZ7 = d0aVar.z();
                                                int i6 = (iZ6 << 4) | (iZ7 >> 4);
                                                int iZ8 = ((iZ7 & 15) << 8) | d0aVar.z();
                                                int iZ9 = d0aVar.z();
                                                int iZ10 = d0aVar.z();
                                                tyfVar.i = new Rect(i6, (iZ9 << 4) | (iZ10 >> 4), iZ8 + 1, (((iZ10 & 15) << 8) | d0aVar.z()) + 1);
                                                c4 = 1;
                                            } else {
                                                xo1.V("VobsubParser", "Incomplete area command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 6:
                                            if (d0aVar.a() >= 4) {
                                                tyfVar.j = d0aVar.G();
                                                tyfVar.k = d0aVar.G();
                                                c4 = 1;
                                            } else {
                                                xo1.V("VobsubParser", "Incomplete offsets command");
                                                c4 = c5;
                                            }
                                            break;
                                        default:
                                            kv2.w(iZ, "Unrecognized command: ", "VobsubParser");
                                            c4 = c5;
                                            break;
                                    }
                                } else {
                                    c4 = c5;
                                }
                                c3 = c5;
                            }
                            c2 = c3;
                            if (c != 0) {
                                d0aVar.M(iG2);
                            }
                        }
                        if (c != 0) {
                            j5 = j;
                            c3 = c2;
                        }
                    }
                } else {
                    xo1.V("VobsubParser", "Skipping SPU (no plane)");
                }
                if (tyfVar.f != null || !tyfVar.d || !tyfVar.e || (rect = tyfVar.i) == null || tyfVar.j == -1 || tyfVar.k == -1 || rect.width() < 2 || tyfVar.i.height() < 2) {
                    t03Var = null;
                } else {
                    Rect rect2 = tyfVar.i;
                    int[] iArr2 = new int[rect2.height() * rect2.width()];
                    zu1 zu1Var = new zu1();
                    d0aVar.M(tyfVar.j);
                    zu1Var.k(d0aVar);
                    tyfVar.b(zu1Var, true, rect2, iArr2);
                    d0aVar.M(tyfVar.k);
                    zu1Var.k(d0aVar);
                    tyfVar.b(zu1Var, c2, rect2, iArr2);
                    t03Var = new t03(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / tyfVar.h, 0, 0, rect2.left / tyfVar.g, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / tyfVar.g, rect2.height() / tyfVar.h, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                }
                j2 = tyfVar.c;
                if (j2 != j) {
                    j4 = tyfVar.b;
                    if (j4 != j && j2 > j4) {
                        j2 -= j4;
                    }
                    j3 = j2;
                } else {
                    j3 = j;
                }
                if (t03Var != null) {
                    yobVarS = jy6.s(t03Var);
                } else {
                    ey6 ey6Var = jy6.b;
                    yobVarS = yob.e;
                }
                w03Var = new w03(tyfVar.b, j3, yobVarS);
            }
            j = -9223372036854775807L;
            c2 = 0;
            if (tyfVar.f != null) {
                t03Var = null;
            } else {
                t03Var = null;
            }
            j2 = tyfVar.c;
            if (j2 != j) {
                j4 = tyfVar.b;
                if (j4 != j) {
                    j2 -= j4;
                }
                j3 = j2;
            } else {
                j3 = j;
            }
            if (t03Var != null) {
                yobVarS = jy6.s(t03Var);
            } else {
                ey6 ey6Var2 = jy6.b;
                yobVarS = yob.e;
            }
            w03Var = new w03(tyfVar.b, j3, yobVarS);
        }
        xl2Var.accept(w03Var);
    }
}
