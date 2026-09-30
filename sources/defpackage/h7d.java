package defpackage;

import ai.askquin.R;
import ai.askquin.ui.share.SharedDivination;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h7d {
    public static final y6c a = a7c.b(40.0f);

    public static final void a(j09 j09Var, float f, dd2 dd2Var, l46 l46Var, int i, int i2) {
        float f2;
        int i3;
        j09 j09Var2;
        dd2 dd2Var2;
        float f3;
        j09 j09VarW;
        l46Var.h0(830602466);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            f2 = f;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 = i | (l46Var.d(f2) ? 32 : 16);
        } else {
            f2 = f;
            i3 = i;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            float f4 = i4 != 0 ? 0.5f : f2;
            y6c y6cVar = a;
            j09Var2 = j09Var;
            j09 j09VarE = oa7.E(j09Var2, y6cVar);
            pr4 pr4Var = l8b.a;
            long j = ((e8b) l46Var.k(pr4Var)).e;
            y02 y02Var = g21.f;
            j09 j09VarO = tm7.o(j09VarE, j, y02Var);
            int iA = yi4.a(f4, 0.0f);
            g09 g09Var = g09.a;
            if (iA > 0) {
                l46Var.f0(1171772277);
                j09VarW = db6.w(g09Var, f4, ((e8b) l46Var.k(pr4Var)).B, y6cVar);
                l46Var.r(false);
            } else {
                l46Var.f0(1171881986);
                l46Var.r(false);
                j09VarW = g09Var;
            }
            j09 j09VarD = j09VarO.D(j09VarW);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            d31 d31Var = d31.a;
            feg.j(od4.A(R.drawable.bg_iris, 0, l46Var), null, d31Var.b(g09Var), null, an2.a, 0.0f, null, l46Var, 24632, 104);
            s21.a(tm7.o(d31Var.b(g09Var), ((e8b) l46Var.k(pr4Var)).g, y02Var), l46Var, 0);
            dd2Var2 = dd2Var;
            dd2Var2.m(d31Var, l46Var, 54);
            l46Var.r(true);
            f3 = f4;
        } else {
            j09Var2 = j09Var;
            dd2Var2 = dd2Var;
            l46Var.Z();
            f3 = f2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tz5(j09Var2, f3, dd2Var2, i, i2, 1);
        }
    }

    public static final void b(int i, long j, l46 l46Var, j09 j09Var) {
        j09Var.getClass();
        l46Var.h0(1245240358);
        int i2 = (l46Var.f(j) ? 32 : 16) | i;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new ac(j, 19);
                l46Var.p0(objR);
            }
            s21.a(b21.s(j09Var, (a26) objR), l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cr(j09Var, j, i);
        }
    }

    public static final void c(Bitmap bitmap, String str, a26 a26Var, boolean z, l46 l46Var, int i) {
        l46Var.h0(826449088);
        int i2 = (l46Var.i(bitmap) ? 32 : 16) | i | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            l46Var.f0(-351354506);
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            p6d.f(((i2 >> 3) & 896) | 54, a26Var, l46Var, g09Var, z);
            l46Var.r(true);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(bitmap, str, a26Var, z, i);
        }
    }

    public static final void d(final Bitmap bitmap, final a26 a26Var, l46 l46Var, final int i) {
        final Bitmap bitmap2;
        final a26 a26Var2;
        l46Var.h0(780117628);
        int i2 = (l46Var.i(bitmap) ? 4 : 2) | i | (l46Var.i(a26Var) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (!l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            bitmap2 = bitmap;
            a26Var2 = a26Var;
            l46Var.Z();
        } else {
            if (bitmap == null) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26(bitmap, a26Var, i, i3) { // from class: y6d
                        public final /* synthetic */ int a;
                        public final /* synthetic */ Bitmap b;
                        public final /* synthetic */ a26 c;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i5 = this.a;
                            wef wefVar = wef.a;
                            a26 a26Var3 = this.c;
                            Bitmap bitmap3 = this.b;
                            l46 l46Var2 = (l46) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    h7d.d(bitmap3, a26Var3, l46Var2, k99.P(1));
                                    break;
                                default:
                                    h7d.d(bitmap3, a26Var3, l46Var2, k99.P(1));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            boolean zBooleanValue = ((Boolean) l46Var.k(sad.b)).booleanValue();
            int iIntValue = ((Number) l46Var.k(sad.c)).intValue();
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            boolean zH = l46Var.h(zF);
            Object objR = l46Var.R();
            if (zH || objR == sf2.a) {
                objR = q1c.f(Boolean.valueOf(zF));
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            j09 j09VarC = b.c(g09.a, 1.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarC);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            bitmap2 = bitmap;
            a26Var2 = a26Var;
            g21.s(392.0f, af1.b0(-794769846, new a60(bitmap2, zBooleanValue, iIntValue, a26Var2, e89Var), l46Var), l46Var, 54);
            l46Var.r(true);
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new l26(bitmap2, a26Var2, i, i4) { // from class: y6d
                public final /* synthetic */ int a;
                public final /* synthetic */ Bitmap b;
                public final /* synthetic */ a26 c;

                {
                    this.a = i4;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i5 = this.a;
                    wef wefVar = wef.a;
                    a26 a26Var3 = this.c;
                    Bitmap bitmap3 = this.b;
                    l46 l46Var2 = (l46) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            h7d.d(bitmap3, a26Var3, l46Var2, k99.P(1));
                            break;
                        default:
                            h7d.d(bitmap3, a26Var3, l46Var2, k99.P(1));
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void e(SharedDivination sharedDivination, x6d x6dVar, x16 x16Var, Bitmap bitmap, l46 l46Var, int i) {
        int i2;
        Object d7dVar;
        String str;
        Object ladVar;
        SharedDivination sharedDivination2 = sharedDivination;
        x6d x6dVar2 = x6dVar;
        sharedDivination2.getClass();
        x16Var.getClass();
        l46Var.h0(496630625);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(sharedDivination2) : l46Var.i(sharedDivination2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(x6dVar2) : l46Var.i(x6dVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(bitmap) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i3 = i2;
        if (!l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            l46Var.Z();
        } else {
            if (x6dVar2.a == xad.Screenshot && bitmap == null) {
                qc0.j("Screenshot sharing requires a bitmap");
                return;
            }
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ihb ihbVar = (ihb) z5c.G(job.a.b(ihb.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            String languageTag = ((Configuration) l46Var.k(uq.a)).getLocales().get(0).toLanguageTag();
            e89 e89VarT = tm7.t(ihbVar.d, l46Var);
            String divinationId = sharedDivination2.getDivinationId();
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            boolean zI = l46Var.i(ihbVar) | (i4 == 4 || ((i3 & 8) != 0 && l46Var.i(sharedDivination2))) | (i5 == 32 || ((i3 & 64) != 0 && l46Var.i(x6dVar2))) | l46Var.g(languageTag);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                str = divinationId;
                d7dVar = new d7d(ihbVar, sharedDivination, x6dVar2, languageTag, null);
                ihbVar = ihbVar;
                sharedDivination2 = sharedDivination;
                x6dVar2 = x6dVar2;
                l46Var.p0(d7dVar);
            } else {
                str = divinationId;
                d7dVar = objR;
            }
            af1.p(str, languageTag, (l26) d7dVar, l46Var);
            fhb fhbVar = (fhb) e89VarT.getValue();
            if (pa7.t(fhbVar, dhb.a)) {
                l46Var.f0(520683589);
                l46Var.r(false);
                ladVar = mad.a;
            } else if (pa7.t(fhbVar, chb.a)) {
                l46Var.f0(520686786);
                boolean zI2 = l46Var.i(ihbVar) | (i4 == 4 || ((i3 & 8) != 0 && l46Var.i(sharedDivination2))) | (i5 == 32 || ((i3 & 64) != 0 && l46Var.i(x6dVar2))) | l46Var.g(languageTag);
                Object objR2 = l46Var.R();
                if (zI2 || objR2 == obj) {
                    ihb ihbVar2 = ihbVar;
                    Object a7dVar = new a7d(ihbVar2, sharedDivination, x6dVar2, languageTag, 0);
                    ihbVar = ihbVar2;
                    sharedDivination2 = sharedDivination;
                    l46Var.p0(a7dVar);
                    objR2 = a7dVar;
                }
                ladVar = new lad((x16) objR2);
                l46Var.r(false);
            } else {
                if (!(fhbVar instanceof ehb)) {
                    throw tec.d(520682148, l46Var, false);
                }
                l46Var.f0(-1038450756);
                l46Var.r(false);
                ladVar = null;
            }
            e1b e1bVarA = vgb.b.a(ladVar);
            pr4 pr4Var = vgb.a;
            boolean zI3 = l46Var.i(ihbVar) | (i4 == 4 || ((i3 & 8) != 0 && l46Var.i(sharedDivination2)));
            Object objR3 = l46Var.R();
            if (zI3 || objR3 == obj) {
                objR3 = new e7d(ihbVar, sharedDivination2, null);
                l46Var.p0(objR3);
            }
            mh3.b(new e1b[]{e1bVarA, pr4Var.a((l26) objR3)}, af1.b0(1686372001, new ug(sharedDivination2, x6dVar, x16Var, e89VarT, ihbVar, languageTag, bitmap), l46Var), l46Var, 48);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(sharedDivination, x6dVar, x16Var, bitmap, i, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:102:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x0411  */
    /* JADX WARN: Code duplicated, block: B:107:0x041d  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:55:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0151  */
    /* JADX WARN: Code duplicated, block: B:69:0x0197  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0263  */
    /* JADX WARN: Code duplicated, block: B:82:0x027f  */
    /* JADX WARN: Code duplicated, block: B:84:0x028b  */
    /* JADX WARN: Code duplicated, block: B:86:0x028e  */
    /* JADX WARN: Code duplicated, block: B:88:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x0320  */
    /* JADX WARN: Code duplicated, block: B:94:0x0329  */
    /* JADX WARN: Code duplicated, block: B:97:0x03af  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r46v0, types: [l46] */
    public static final void f(final j09 j09Var, final x82 x82Var, final float f, float f2, final a26 a26Var, dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        float f3;
        int i3;
        int i4;
        boolean z;
        final dd2 dd2Var2;
        final float f4;
        ojb ojbVarV;
        final float f5;
        pr4 pr4Var;
        boolean zF;
        e89 e89VarI;
        Object obj;
        Resources resources;
        uxb uxbVar;
        boolean zI;
        Object objR;
        l26 l26Var;
        Object objR2;
        e89 e89Var;
        boolean zI2;
        Object objR3;
        uxb uxbVar2;
        boolean z2;
        boolean z3;
        boolean zG;
        Object objR4;
        lx0 lx0Var;
        boolean z4;
        ov7 ov7Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        d31 d31Var;
        g09 g09Var;
        i8c i8cVar;
        lx0 lx0Var2;
        lx0 lx0Var3;
        he2 he2Var5;
        he2 he2Var6;
        he2 he2Var7;
        ov7 ov7Var2;
        g09 g09Var2;
        he2 he2Var8;
        he2 he2Var9;
        he2 he2Var10;
        he2 he2Var11;
        ov7 ov7Var3;
        ?? r0;
        int iOrdinal;
        boolean z5;
        ov7 ov7Var4;
        y02 y02Var = g21.f;
        lx0 lx0Var4 = ndb.w;
        lx0 lx0Var5 = ndb.c;
        a26Var.getClass();
        l46Var.h0(962537534);
        int i5 = (l46Var.g(j09Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= l46Var.e(x82Var.ordinal()) ? 32 : 16;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                f3 = f2;
                i5 |= l46Var.d(f3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if (l46Var.i(a26Var)) {
                i3 = 16384;
            } else {
                i3 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i4 = i5 | i3;
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i6 != 0) {
                    f5 = 0.6f;
                } else {
                    f5 = f3;
                }
                pr4Var = l8b.a;
                zF = k8b.f((e8b) l46Var.k(pr4Var));
                e89VarI = q1c.i(a26Var, l46Var);
                obj = sf2.a;
                if (zF) {
                    l46Var.f0(1754492822);
                    l46Var.r(false);
                    i4 = i4;
                    pr4Var = pr4Var;
                    uxbVar2 = null;
                } else {
                    l46Var.f0(1754514336);
                    resources = ((Context) l46Var.k(uq.b)).getResources();
                    uxbVar = new uxb(null, false);
                    Integer numValueOf = Integer.valueOf(R.drawable.bg_iris);
                    zI = l46Var.i(resources) | l46Var.e(R.drawable.bg_iris);
                    objR = l46Var.R();
                    if (zI || objR == obj) {
                        objR = new wxb(resources, R.drawable.bg_iris, 2, null);
                        l46Var.p0(objR);
                    }
                    l26Var = (l26) objR;
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        objR2 = q1c.f(uxbVar);
                        l46Var.p0(objR2);
                    }
                    e89Var = (e89) objR2;
                    zI2 = l46Var.i(l26Var);
                    objR3 = l46Var.R();
                    if (zI2 || objR3 == obj) {
                        objR3 = new dsd(l26Var, e89Var, null);
                        l46Var.p0(objR3);
                    }
                    af1.q(resources, numValueOf, 2, (l26) objR3, l46Var);
                    uxbVar2 = (uxb) e89Var.getValue();
                    l46Var.r(false);
                }
                if (zF) {
                    z2 = true;
                } else {
                    if (uxbVar2 != null) {
                        z2 = true;
                        if (uxbVar2.b) {
                        }
                        Boolean boolValueOf = Boolean.valueOf(z3);
                        zG = l46Var.g(e89VarI) | l46Var.h(z3);
                        objR4 = l46Var.R();
                        if (zG || objR4 == obj) {
                            objR4 = new g7d(z3, e89VarI, null);
                            l46Var.p0(objR4);
                        }
                        af1.o((l26) objR4, l46Var, boolValueOf);
                        j09 j09VarH = k8b.h(k8b.g(j09Var, new agb(2), l46Var, i4 & 14), new n26() { // from class: b7d
                            @Override // defpackage.n26
                            public final Object m(Object obj2, Object obj3, Object obj4) {
                                j09 j09VarU;
                                y02 y02Var2 = g21.f;
                                j09 j09Var2 = (j09) obj2;
                                l46 l46Var2 = (l46) obj3;
                                ((Integer) obj4).getClass();
                                j09Var2.getClass();
                                l46Var2.f0(-209867422);
                                if (f < 1.0f) {
                                    l46Var2.f0(1312084360);
                                    j09VarU = tm7.o(j09Var2, ((e8b) l46Var2.k(l8b.a)).a, y02Var2);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(1312146670);
                                    j09VarU = m93.u(j09Var2, new ie2(21));
                                    l46Var2.r(false);
                                }
                                float f6 = f5;
                                if (yi4.a(f6, 0.0f) > 0) {
                                    l46Var2.f0(1312266051);
                                    j09VarU = db6.w(j09VarU, f6, ((e8b) l46Var2.k(l8b.a)).z, y02Var2);
                                    l46Var2.r(false);
                                } else {
                                    l46Var2.f0(1312424120);
                                    l46Var2.r(false);
                                }
                                l46Var2.r(false);
                                return j09VarU;
                            }
                        }, l46Var, 0);
                        lx0Var = ndb.b;
                        xn8 xn8VarC = s21.c(lx0Var, false);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ = m93.J(l46Var, j09VarH);
                        lf2.q.getClass();
                        l46Var.j0();
                        z4 = l46Var.S;
                        ov7Var = LayoutNode.h1;
                        if (z4) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        he2Var = hj6.z;
                        dec.l(he2Var, l46Var, xn8VarC);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var, u8aVarM);
                        Integer numValueOf2 = Integer.valueOf(iHashCode);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var, numValueOf2);
                        dec.k(l46Var);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var, j09VarJ);
                        d31Var = d31.a;
                        g09Var = g09.a;
                        j09 j09VarF = oa7.F(d31Var.b(g09Var));
                        float f6 = f5;
                        xn8 xn8VarC2 = s21.c(lx0Var, false);
                        int iHashCode2 = Long.hashCode(l46Var.T);
                        u8a u8aVarM2 = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarF);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(he2Var, l46Var, xn8VarC2);
                        dec.l(he2Var2, l46Var, u8aVarM2);
                        ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                        dec.l(he2Var4, l46Var, j09VarJ2);
                        i8cVar = an2.d;
                        if (zF || f >= 1.0f) {
                            lx0Var2 = lx0Var4;
                            lx0Var3 = lx0Var5;
                            he2Var5 = he2Var4;
                            he2Var6 = he2Var3;
                            he2Var7 = he2Var;
                            ov7Var2 = ov7Var;
                            g09Var2 = g09Var;
                            l46Var.f0(309809528);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(309089739);
                            g09Var2 = g09Var;
                            he2Var5 = he2Var4;
                            he2Var6 = he2Var3;
                            he2Var7 = he2Var;
                            ov7Var2 = ov7Var;
                            feg.j(od4.A(R.drawable.bg_unified_share_neo, 0, l46Var), null, pa7.p(d31Var.a(b.c(g09Var, 1.0f), lx0Var5), f), lx0Var5, i8cVar, 0.0f, null, l46Var, 27704, 96);
                            j09 j09VarP = pa7.p(d31Var.a(b.c(g09Var2, 1.0f), lx0Var4), f);
                            lx0Var2 = lx0Var4;
                            lx0Var3 = lx0Var5;
                            feg.j(od4.A(R.drawable.bg_unified_share_neo, 0, l46Var), null, j09VarP, lx0Var2, i8cVar, 0.0f, null, l46Var, 27704, 96);
                            l46Var.r(false);
                        }
                        if (zF) {
                            he2Var8 = he2Var7;
                            he2Var9 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03b1: MOVE (r36v0 'he2Var9' he2) = (r1v5 he2) (LINE:946) in method: h7d.f(j09, x82, float, float, a26, dd2, l46, int, int):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v5 he2
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 1073
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.h7d.f(j09, x82, float, float, a26, dd2, l46, int, int):void");
                        }

                        /* JADX WARN: Code duplicated, block: B:101:0x0240  */
                        /* JADX WARN: Code duplicated, block: B:103:0x0252  */
                        /* JADX WARN: Code duplicated, block: B:104:0x0256  */
                        /* JADX WARN: Code duplicated, block: B:106:0x02d5  */
                        /* JADX WARN: Code duplicated, block: B:109:0x02e2  */
                        /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:19:0x0034  */
                        /* JADX WARN: Code duplicated, block: B:21:0x003c  */
                        /* JADX WARN: Code duplicated, block: B:22:0x003f  */
                        /* JADX WARN: Code duplicated, block: B:26:0x0048  */
                        /* JADX WARN: Code duplicated, block: B:28:0x004d  */
                        /* JADX WARN: Code duplicated, block: B:30:0x0051  */
                        /* JADX WARN: Code duplicated, block: B:32:0x0059  */
                        /* JADX WARN: Code duplicated, block: B:33:0x005c  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0063  */
                        /* JADX WARN: Code duplicated, block: B:38:0x0068  */
                        /* JADX WARN: Code duplicated, block: B:40:0x0070  */
                        /* JADX WARN: Code duplicated, block: B:41:0x0073  */
                        /* JADX WARN: Code duplicated, block: B:45:0x007e  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0080  */
                        /* JADX WARN: Code duplicated, block: B:49:0x0089  */
                        /* JADX WARN: Code duplicated, block: B:51:0x0090  */
                        /* JADX WARN: Code duplicated, block: B:60:0x00a6 A[PHI: r2 r3 r5 r8
  0x00a6: PHI (r2v36 int) = (r2v13 int), (r2v38 int), (r2v39 int) binds: [B:69:0x00cc, B:58:0x00a2, B:59:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r3v18 long) = (r3v4 long), (r3v3 long), (r3v3 long) binds: [B:69:0x00cc, B:58:0x00a2, B:59:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r5v19 int) = (r5v8 int), (r5v5 int), (r5v5 int) binds: [B:69:0x00cc, B:58:0x00a2, B:59:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r8v15 java.lang.String) = (r8v4 java.lang.String), (r8v2 java.lang.String), (r8v2 java.lang.String) binds: [B:69:0x00cc, B:58:0x00a2, B:59:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
                        /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
                        /* JADX WARN: Code duplicated, block: B:66:0x00c2  */
                        /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
                        /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
                        /* JADX WARN: Code duplicated, block: B:73:0x0100 A[ADDED_TO_REGION] */
                        /* JADX WARN: Code duplicated, block: B:74:0x0102 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:75:0x0104  */
                        /* JADX WARN: Code duplicated, block: B:77:0x010a  */
                        /* JADX WARN: Code duplicated, block: B:81:0x0149  */
                        /* JADX WARN: Code duplicated, block: B:82:0x014d  */
                        /* JADX WARN: Code duplicated, block: B:85:0x016d  */
                        /* JADX WARN: Code duplicated, block: B:86:0x017a  */
                        /* JADX WARN: Code duplicated, block: B:88:0x0194  */
                        /* JADX WARN: Code duplicated, block: B:90:0x01aa  */
                        /* JADX WARN: Code duplicated, block: B:93:0x01e5  */
                        /* JADX WARN: Code duplicated, block: B:94:0x01e9  */
                        /* JADX WARN: Code duplicated, block: B:97:0x01fa  */
                        /* JADX WARN: Code duplicated, block: B:99:0x021c  */
                        public static final void g(final j09 j09Var, long j, int i, String str, float f, l46 l46Var, final int i2, final int i3) {
                            int i4;
                            long j2;
                            int i5;
                            int i6;
                            int i7;
                            int i8;
                            String str2;
                            int i9;
                            int i10;
                            float f2;
                            int i11;
                            int i12;
                            boolean z;
                            final long j3;
                            final int i13;
                            final String str3;
                            final float f3;
                            ojb ojbVarV;
                            int i14;
                            long j4;
                            int i15;
                            String str4;
                            float f4;
                            String str5;
                            int iD0;
                            boolean zG;
                            Object objR;
                            i8c i8cVar;
                            ks ksVarA;
                            cv6 cv6Var;
                            y6c y6cVarB;
                            boolean z2;
                            ov7 ov7Var;
                            he2 he2Var;
                            he2 he2Var2;
                            he2 he2Var3;
                            he2 he2Var4;
                            boolean z3;
                            boolean z4;
                            String str6;
                            int i16;
                            g09 g09Var;
                            Object objR2;
                            boolean z5;
                            l46 l46Var2 = l46Var;
                            l46Var2.h0(1874248014);
                            if ((i2 & 6) == 0) {
                                i4 = (l46Var2.g(j09Var) ? 4 : 2) | i2;
                            } else {
                                i4 = i2;
                            }
                            if ((i3 & 2) == 0) {
                                j2 = j;
                                int i17 = l46Var2.f(j2) ? 32 : 16;
                                int i18 = i4 | i17;
                                if ((i3 & 4) == 0) {
                                    i5 = i;
                                    if (l46Var2.e(i5)) {
                                        i6 = 256;
                                    }
                                    i7 = i18 | i6;
                                    i8 = i3 & 8;
                                    if (i8 != 0) {
                                        if ((i2 & 3072) == 0) {
                                            str2 = str;
                                            if (l46Var2.g(str2)) {
                                                i9 = 2048;
                                            } else {
                                                i9 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                                            }
                                            i7 |= i9;
                                        }
                                        i10 = i3 & 16;
                                        if (i10 != 0) {
                                            i12 = i7 | 24576;
                                            f2 = f;
                                        } else {
                                            f2 = f;
                                            if (l46Var2.d(f2)) {
                                                i11 = 16384;
                                            } else {
                                                i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                            }
                                            i12 = i7 | i11;
                                        }
                                        if ((i12 & 9363) != 9362) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (l46Var2.W(i12 & 1, z)) {
                                            l46Var2.b0();
                                            if ((i2 & 1) != 0 || l46Var2.C()) {
                                                if ((i3 & 2) != 0) {
                                                    j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                                    i12 &= -113;
                                                }
                                                if ((i3 & 4) != 0) {
                                                    i12 &= -897;
                                                    i5 = R.string.share_qr_code_tips;
                                                }
                                                if (i8 != 0) {
                                                    str2 = Constants.LONG;
                                                }
                                                if (i10 != 0) {
                                                    i14 = i12;
                                                    j4 = j2;
                                                    i15 = i5;
                                                    str4 = str2;
                                                    f4 = 1.0f;
                                                }
                                                l46Var2.s();
                                                str5 = (String) l46Var2.k(vgb.c);
                                                iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                                zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                                objR = l46Var2.R();
                                                i8cVar = sf2.a;
                                                if (zG || objR == i8cVar) {
                                                    if (str5 != null) {
                                                        ksVarA = vgb.a(iD0, str5);
                                                    } else {
                                                        ksVarA = null;
                                                    }
                                                    objR = ksVarA;
                                                    l46Var2.p0(objR);
                                                }
                                                cv6Var = (cv6) objR;
                                                y6cVarB = a7c.b(8.0f);
                                                c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                                int iHashCode = Long.hashCode(l46Var2.T);
                                                u8a u8aVarM = l46Var2.m();
                                                j09 j09VarJ = m93.J(l46Var2, j09Var);
                                                lf2.q.getClass();
                                                l46Var2.j0();
                                                z2 = l46Var2.S;
                                                ov7Var = LayoutNode.h1;
                                                if (z2) {
                                                    l46Var2.l(ov7Var);
                                                } else {
                                                    l46Var2.s0();
                                                }
                                                he2Var = hj6.z;
                                                dec.l(he2Var, l46Var2, c92VarA);
                                                he2Var2 = hj6.y;
                                                dec.l(he2Var2, l46Var2, u8aVarM);
                                                Integer numValueOf = Integer.valueOf(iHashCode);
                                                he2Var3 = hj6.X;
                                                dec.l(he2Var3, l46Var2, numValueOf);
                                                dec.k(l46Var2);
                                                he2Var4 = hj6.x;
                                                dec.l(he2Var4, l46Var2, j09VarJ);
                                                if (str5 != null) {
                                                    l46Var2.f0(2092528646);
                                                    l46Var2.r(false);
                                                    z3 = true;
                                                } else {
                                                    l46Var2.f0(760238228);
                                                    z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                                    l46Var2.r(false);
                                                }
                                                if (z3) {
                                                    l46Var2.f0(2092595338);
                                                    g09Var = g09.a;
                                                    j09 j09VarL = b.l(g09Var, 56.0f);
                                                    objR2 = l46Var2.R();
                                                    if (objR2 == i8cVar) {
                                                        objR2 = new e2d(11);
                                                        l46Var2.p0(objR2);
                                                    }
                                                    j09 j09VarO = tm7.o(oa7.E(vwc.b(j09VarL, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                                    xn8 xn8VarC = s21.c(ndb.f, false);
                                                    int iHashCode2 = Long.hashCode(l46Var2.T);
                                                    u8a u8aVarM2 = l46Var2.m();
                                                    j09 j09VarJ2 = m93.J(l46Var2, j09VarO);
                                                    l46Var2.j0();
                                                    if (l46Var2.S) {
                                                        l46Var2.l(ov7Var);
                                                    } else {
                                                        l46Var2.s0();
                                                    }
                                                    dec.l(he2Var, l46Var2, xn8VarC);
                                                    dec.l(he2Var2, l46Var2, u8aVarM2);
                                                    ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                                                    dec.l(he2Var4, l46Var2, j09VarJ2);
                                                    if (cv6Var != null) {
                                                        l46Var2.f0(-1417416064);
                                                        str6 = str5;
                                                        feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                                        z5 = false;
                                                        l46Var2.r(false);
                                                    } else {
                                                        str6 = str5;
                                                        l46Var2.f0(924114454);
                                                        a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                                        z5 = false;
                                                        l46Var2.r(false);
                                                    }
                                                    z4 = true;
                                                    l46Var2.r(true);
                                                    l46Var2.r(z5);
                                                } else {
                                                    z4 = true;
                                                    str6 = str5;
                                                    l46Var2.f0(2093148874);
                                                    l46Var2.r(false);
                                                }
                                                if (str6 != null) {
                                                    i16 = R.string.share_reading_qr_tips;
                                                } else {
                                                    i16 = i15;
                                                }
                                                String strQ = afc.q(i16, l46Var2);
                                                mue mueVar = pue.a;
                                                mue mueVarJ = pue.j(l46Var2);
                                                xtd xtdVar = mueVarJ.a;
                                                float fN = mh3.n(f4, 0.0f, 1.0f);
                                                long j5 = j4;
                                                nte.b(strQ, null, j5, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ, 0L, w6c.r(4294967296L, wue.c(xtdVar.b) * fN), null, null, w6c.r(4294967296L, wue.c(xtdVar.h) * fN), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                                l46Var2 = l46Var;
                                                l46Var2.r(z4);
                                                f3 = f4;
                                                j3 = j5;
                                                i13 = i15;
                                                str3 = str4;
                                            } else {
                                                l46Var2.Z();
                                                if ((i3 & 2) != 0) {
                                                    i12 &= -113;
                                                }
                                                if ((i3 & 4) != 0) {
                                                    i12 &= -897;
                                                }
                                            }
                                            i14 = i12;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = f2;
                                            j4 = j2;
                                            l46Var2.s();
                                            str5 = (String) l46Var2.k(vgb.c);
                                            iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                            zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                            objR = l46Var2.R();
                                            i8cVar = sf2.a;
                                            if (zG) {
                                                if (str5 != null) {
                                                    ksVarA = vgb.a(iD0, str5);
                                                } else {
                                                    ksVarA = null;
                                                }
                                                objR = ksVarA;
                                                l46Var2.p0(objR);
                                            } else {
                                                if (str5 != null) {
                                                    ksVarA = vgb.a(iD0, str5);
                                                } else {
                                                    ksVarA = null;
                                                }
                                                objR = ksVarA;
                                                l46Var2.p0(objR);
                                            }
                                            cv6Var = (cv6) objR;
                                            y6cVarB = a7c.b(8.0f);
                                            c92 c92VarA2 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                            int iHashCode3 = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM3 = l46Var2.m();
                                            j09 j09VarJ3 = m93.J(l46Var2, j09Var);
                                            lf2.q.getClass();
                                            l46Var2.j0();
                                            z2 = l46Var2.S;
                                            ov7Var = LayoutNode.h1;
                                            if (z2) {
                                                l46Var2.l(ov7Var);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            he2Var = hj6.z;
                                            dec.l(he2Var, l46Var2, c92VarA2);
                                            he2Var2 = hj6.y;
                                            dec.l(he2Var2, l46Var2, u8aVarM3);
                                            Integer numValueOf2 = Integer.valueOf(iHashCode3);
                                            he2Var3 = hj6.X;
                                            dec.l(he2Var3, l46Var2, numValueOf2);
                                            dec.k(l46Var2);
                                            he2Var4 = hj6.x;
                                            dec.l(he2Var4, l46Var2, j09VarJ3);
                                            if (str5 != null) {
                                                l46Var2.f0(2092528646);
                                                l46Var2.r(false);
                                                z3 = true;
                                            } else {
                                                l46Var2.f0(760238228);
                                                z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                                l46Var2.r(false);
                                            }
                                            if (z3) {
                                                l46Var2.f0(2092595338);
                                                g09Var = g09.a;
                                                j09 j09VarL2 = b.l(g09Var, 56.0f);
                                                objR2 = l46Var2.R();
                                                if (objR2 == i8cVar) {
                                                    objR2 = new e2d(11);
                                                    l46Var2.p0(objR2);
                                                }
                                                j09 j09VarO2 = tm7.o(oa7.E(vwc.b(j09VarL2, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                                xn8 xn8VarC2 = s21.c(ndb.f, false);
                                                int iHashCode4 = Long.hashCode(l46Var2.T);
                                                u8a u8aVarM4 = l46Var2.m();
                                                j09 j09VarJ4 = m93.J(l46Var2, j09VarO2);
                                                l46Var2.j0();
                                                if (l46Var2.S) {
                                                    l46Var2.l(ov7Var);
                                                } else {
                                                    l46Var2.s0();
                                                }
                                                dec.l(he2Var, l46Var2, xn8VarC2);
                                                dec.l(he2Var2, l46Var2, u8aVarM4);
                                                ib8.s(iHashCode4, l46Var2, he2Var3, l46Var2);
                                                dec.l(he2Var4, l46Var2, j09VarJ4);
                                                if (cv6Var != null) {
                                                    l46Var2.f0(-1417416064);
                                                    str6 = str5;
                                                    feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                                    z5 = false;
                                                    l46Var2.r(false);
                                                } else {
                                                    str6 = str5;
                                                    l46Var2.f0(924114454);
                                                    a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                                    z5 = false;
                                                    l46Var2.r(false);
                                                }
                                                z4 = true;
                                                l46Var2.r(true);
                                                l46Var2.r(z5);
                                            } else {
                                                z4 = true;
                                                str6 = str5;
                                                l46Var2.f0(2093148874);
                                                l46Var2.r(false);
                                            }
                                            if (str6 != null) {
                                                i16 = R.string.share_reading_qr_tips;
                                            } else {
                                                i16 = i15;
                                            }
                                            String strQ2 = afc.q(i16, l46Var2);
                                            mue mueVar2 = pue.a;
                                            mue mueVarJ2 = pue.j(l46Var2);
                                            xtd xtdVar2 = mueVarJ2.a;
                                            float fN2 = mh3.n(f4, 0.0f, 1.0f);
                                            long j6 = j4;
                                            nte.b(strQ2, null, j6, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ2, 0L, w6c.r(4294967296L, wue.c(xtdVar2.b) * fN2), null, null, w6c.r(4294967296L, wue.c(xtdVar2.h) * fN2), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                            l46Var2 = l46Var;
                                            l46Var2.r(z4);
                                            f3 = f4;
                                            j3 = j6;
                                            i13 = i15;
                                            str3 = str4;
                                        } else {
                                            l46Var2.Z();
                                            j3 = j2;
                                            i13 = i5;
                                            str3 = str2;
                                            f3 = f2;
                                        }
                                        ojbVarV = l46Var2.v();
                                        if (ojbVarV != null) {
                                            ojbVarV.d = new l26() { // from class: z6d
                                                @Override // defpackage.l26
                                                public final Object z(Object obj, Object obj2) {
                                                    ((Integer) obj2).getClass();
                                                    h7d.g(j09Var, j3, i13, str3, f3, (l46) obj, k99.P(i2 | 1), i3);
                                                    return wef.a;
                                                }
                                            };
                                        }
                                    }
                                    i7 |= 3072;
                                    str2 = str;
                                    i10 = i3 & 16;
                                    if (i10 != 0) {
                                        i12 = i7 | 24576;
                                        f2 = f;
                                    } else {
                                        f2 = f;
                                        if (l46Var2.d(f2)) {
                                            i11 = 16384;
                                        } else {
                                            i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                        }
                                        i12 = i7 | i11;
                                    }
                                    if ((i12 & 9363) != 9362) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (l46Var2.W(i12 & 1, z)) {
                                        l46Var2.b0();
                                        if ((i2 & 1) != 0) {
                                            if ((i3 & 2) != 0) {
                                                j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                                i12 &= -113;
                                            }
                                            if ((i3 & 4) != 0) {
                                                i12 &= -897;
                                                i5 = R.string.share_qr_code_tips;
                                            }
                                            if (i8 != 0) {
                                                str2 = Constants.LONG;
                                            }
                                            if (i10 != 0) {
                                                i14 = i12;
                                                j4 = j2;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = 1.0f;
                                            } else {
                                                i14 = i12;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = f2;
                                                j4 = j2;
                                            }
                                        } else {
                                            if ((i3 & 2) != 0) {
                                                j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                                i12 &= -113;
                                            }
                                            if ((i3 & 4) != 0) {
                                                i12 &= -897;
                                                i5 = R.string.share_qr_code_tips;
                                            }
                                            if (i8 != 0) {
                                                str2 = Constants.LONG;
                                            }
                                            if (i10 != 0) {
                                                i14 = i12;
                                                j4 = j2;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = 1.0f;
                                            } else {
                                                i14 = i12;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = f2;
                                                j4 = j2;
                                            }
                                        }
                                        l46Var2.s();
                                        str5 = (String) l46Var2.k(vgb.c);
                                        iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                        zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                        objR = l46Var2.R();
                                        i8cVar = sf2.a;
                                        if (zG) {
                                            if (str5 != null) {
                                                ksVarA = vgb.a(iD0, str5);
                                            } else {
                                                ksVarA = null;
                                            }
                                            objR = ksVarA;
                                            l46Var2.p0(objR);
                                        } else {
                                            if (str5 != null) {
                                                ksVarA = vgb.a(iD0, str5);
                                            } else {
                                                ksVarA = null;
                                            }
                                            objR = ksVarA;
                                            l46Var2.p0(objR);
                                        }
                                        cv6Var = (cv6) objR;
                                        y6cVarB = a7c.b(8.0f);
                                        c92 c92VarA3 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                        int iHashCode5 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM5 = l46Var2.m();
                                        j09 j09VarJ5 = m93.J(l46Var2, j09Var);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        z2 = l46Var2.S;
                                        ov7Var = LayoutNode.h1;
                                        if (z2) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        he2Var = hj6.z;
                                        dec.l(he2Var, l46Var2, c92VarA3);
                                        he2Var2 = hj6.y;
                                        dec.l(he2Var2, l46Var2, u8aVarM5);
                                        Integer numValueOf3 = Integer.valueOf(iHashCode5);
                                        he2Var3 = hj6.X;
                                        dec.l(he2Var3, l46Var2, numValueOf3);
                                        dec.k(l46Var2);
                                        he2Var4 = hj6.x;
                                        dec.l(he2Var4, l46Var2, j09VarJ5);
                                        if (str5 != null) {
                                            l46Var2.f0(2092528646);
                                            l46Var2.r(false);
                                            z3 = true;
                                        } else {
                                            l46Var2.f0(760238228);
                                            z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                            l46Var2.r(false);
                                        }
                                        if (z3) {
                                            l46Var2.f0(2092595338);
                                            g09Var = g09.a;
                                            j09 j09VarL3 = b.l(g09Var, 56.0f);
                                            objR2 = l46Var2.R();
                                            if (objR2 == i8cVar) {
                                                objR2 = new e2d(11);
                                                l46Var2.p0(objR2);
                                            }
                                            j09 j09VarO3 = tm7.o(oa7.E(vwc.b(j09VarL3, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                            xn8 xn8VarC3 = s21.c(ndb.f, false);
                                            int iHashCode6 = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM6 = l46Var2.m();
                                            j09 j09VarJ6 = m93.J(l46Var2, j09VarO3);
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(ov7Var);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(he2Var, l46Var2, xn8VarC3);
                                            dec.l(he2Var2, l46Var2, u8aVarM6);
                                            ib8.s(iHashCode6, l46Var2, he2Var3, l46Var2);
                                            dec.l(he2Var4, l46Var2, j09VarJ6);
                                            if (cv6Var != null) {
                                                l46Var2.f0(-1417416064);
                                                str6 = str5;
                                                feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                                z5 = false;
                                                l46Var2.r(false);
                                            } else {
                                                str6 = str5;
                                                l46Var2.f0(924114454);
                                                a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                                z5 = false;
                                                l46Var2.r(false);
                                            }
                                            z4 = true;
                                            l46Var2.r(true);
                                            l46Var2.r(z5);
                                        } else {
                                            z4 = true;
                                            str6 = str5;
                                            l46Var2.f0(2093148874);
                                            l46Var2.r(false);
                                        }
                                        if (str6 != null) {
                                            i16 = R.string.share_reading_qr_tips;
                                        } else {
                                            i16 = i15;
                                        }
                                        String strQ3 = afc.q(i16, l46Var2);
                                        mue mueVar3 = pue.a;
                                        mue mueVarJ3 = pue.j(l46Var2);
                                        xtd xtdVar3 = mueVarJ3.a;
                                        float fN3 = mh3.n(f4, 0.0f, 1.0f);
                                        long j7 = j4;
                                        nte.b(strQ3, null, j7, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ3, 0L, w6c.r(4294967296L, wue.c(xtdVar3.b) * fN3), null, null, w6c.r(4294967296L, wue.c(xtdVar3.h) * fN3), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                        l46Var2 = l46Var;
                                        l46Var2.r(z4);
                                        f3 = f4;
                                        j3 = j7;
                                        i13 = i15;
                                        str3 = str4;
                                    } else {
                                        l46Var2.Z();
                                        j3 = j2;
                                        i13 = i5;
                                        str3 = str2;
                                        f3 = f2;
                                    }
                                    ojbVarV = l46Var2.v();
                                    if (ojbVarV != null) {
                                        ojbVarV.d = new l26() { // from class: z6d
                                            @Override // defpackage.l26
                                            public final Object z(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                h7d.g(j09Var, j3, i13, str3, f3, (l46) obj, k99.P(i2 | 1), i3);
                                                return wef.a;
                                            }
                                        };
                                    }
                                }
                                i5 = i;
                                i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                i7 = i18 | i6;
                                i8 = i3 & 8;
                                if (i8 != 0) {
                                    if ((i2 & 3072) == 0) {
                                        str2 = str;
                                        if (l46Var2.g(str2)) {
                                            i9 = 2048;
                                        } else {
                                            i9 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                                        }
                                        i7 |= i9;
                                    }
                                    i10 = i3 & 16;
                                    if (i10 != 0) {
                                        i12 = i7 | 24576;
                                        f2 = f;
                                    } else {
                                        f2 = f;
                                        if (l46Var2.d(f2)) {
                                            i11 = 16384;
                                        } else {
                                            i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                        }
                                        i12 = i7 | i11;
                                    }
                                    if ((i12 & 9363) != 9362) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (l46Var2.W(i12 & 1, z)) {
                                        l46Var2.b0();
                                        if ((i2 & 1) != 0) {
                                            if ((i3 & 2) != 0) {
                                                j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                                i12 &= -113;
                                            }
                                            if ((i3 & 4) != 0) {
                                                i12 &= -897;
                                                i5 = R.string.share_qr_code_tips;
                                            }
                                            if (i8 != 0) {
                                                str2 = Constants.LONG;
                                            }
                                            if (i10 != 0) {
                                                i14 = i12;
                                                j4 = j2;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = 1.0f;
                                            } else {
                                                i14 = i12;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = f2;
                                                j4 = j2;
                                            }
                                        } else {
                                            if ((i3 & 2) != 0) {
                                                j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                                i12 &= -113;
                                            }
                                            if ((i3 & 4) != 0) {
                                                i12 &= -897;
                                                i5 = R.string.share_qr_code_tips;
                                            }
                                            if (i8 != 0) {
                                                str2 = Constants.LONG;
                                            }
                                            if (i10 != 0) {
                                                i14 = i12;
                                                j4 = j2;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = 1.0f;
                                            } else {
                                                i14 = i12;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = f2;
                                                j4 = j2;
                                            }
                                        }
                                        l46Var2.s();
                                        str5 = (String) l46Var2.k(vgb.c);
                                        iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                        zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                        objR = l46Var2.R();
                                        i8cVar = sf2.a;
                                        if (zG) {
                                            if (str5 != null) {
                                                ksVarA = vgb.a(iD0, str5);
                                            } else {
                                                ksVarA = null;
                                            }
                                            objR = ksVarA;
                                            l46Var2.p0(objR);
                                        } else {
                                            if (str5 != null) {
                                                ksVarA = vgb.a(iD0, str5);
                                            } else {
                                                ksVarA = null;
                                            }
                                            objR = ksVarA;
                                            l46Var2.p0(objR);
                                        }
                                        cv6Var = (cv6) objR;
                                        y6cVarB = a7c.b(8.0f);
                                        c92 c92VarA4 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                        int iHashCode7 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM7 = l46Var2.m();
                                        j09 j09VarJ7 = m93.J(l46Var2, j09Var);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        z2 = l46Var2.S;
                                        ov7Var = LayoutNode.h1;
                                        if (z2) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        he2Var = hj6.z;
                                        dec.l(he2Var, l46Var2, c92VarA4);
                                        he2Var2 = hj6.y;
                                        dec.l(he2Var2, l46Var2, u8aVarM7);
                                        Integer numValueOf4 = Integer.valueOf(iHashCode7);
                                        he2Var3 = hj6.X;
                                        dec.l(he2Var3, l46Var2, numValueOf4);
                                        dec.k(l46Var2);
                                        he2Var4 = hj6.x;
                                        dec.l(he2Var4, l46Var2, j09VarJ7);
                                        if (str5 != null) {
                                            l46Var2.f0(2092528646);
                                            l46Var2.r(false);
                                            z3 = true;
                                        } else {
                                            l46Var2.f0(760238228);
                                            z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                            l46Var2.r(false);
                                        }
                                        if (z3) {
                                            l46Var2.f0(2092595338);
                                            g09Var = g09.a;
                                            j09 j09VarL4 = b.l(g09Var, 56.0f);
                                            objR2 = l46Var2.R();
                                            if (objR2 == i8cVar) {
                                                objR2 = new e2d(11);
                                                l46Var2.p0(objR2);
                                            }
                                            j09 j09VarO4 = tm7.o(oa7.E(vwc.b(j09VarL4, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                            xn8 xn8VarC4 = s21.c(ndb.f, false);
                                            int iHashCode8 = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM8 = l46Var2.m();
                                            j09 j09VarJ8 = m93.J(l46Var2, j09VarO4);
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(ov7Var);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(he2Var, l46Var2, xn8VarC4);
                                            dec.l(he2Var2, l46Var2, u8aVarM8);
                                            ib8.s(iHashCode8, l46Var2, he2Var3, l46Var2);
                                            dec.l(he2Var4, l46Var2, j09VarJ8);
                                            if (cv6Var != null) {
                                                l46Var2.f0(-1417416064);
                                                str6 = str5;
                                                feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                                z5 = false;
                                                l46Var2.r(false);
                                            } else {
                                                str6 = str5;
                                                l46Var2.f0(924114454);
                                                a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                                z5 = false;
                                                l46Var2.r(false);
                                            }
                                            z4 = true;
                                            l46Var2.r(true);
                                            l46Var2.r(z5);
                                        } else {
                                            z4 = true;
                                            str6 = str5;
                                            l46Var2.f0(2093148874);
                                            l46Var2.r(false);
                                        }
                                        if (str6 != null) {
                                            i16 = R.string.share_reading_qr_tips;
                                        } else {
                                            i16 = i15;
                                        }
                                        String strQ4 = afc.q(i16, l46Var2);
                                        mue mueVar4 = pue.a;
                                        mue mueVarJ4 = pue.j(l46Var2);
                                        xtd xtdVar4 = mueVarJ4.a;
                                        float fN4 = mh3.n(f4, 0.0f, 1.0f);
                                        long j8 = j4;
                                        nte.b(strQ4, null, j8, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ4, 0L, w6c.r(4294967296L, wue.c(xtdVar4.b) * fN4), null, null, w6c.r(4294967296L, wue.c(xtdVar4.h) * fN4), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                        l46Var2 = l46Var;
                                        l46Var2.r(z4);
                                        f3 = f4;
                                        j3 = j8;
                                        i13 = i15;
                                        str3 = str4;
                                    } else {
                                        l46Var2.Z();
                                        j3 = j2;
                                        i13 = i5;
                                        str3 = str2;
                                        f3 = f2;
                                    }
                                    ojbVarV = l46Var2.v();
                                    if (ojbVarV != null) {
                                        ojbVarV.d = new l26() { // from class: z6d
                                            @Override // defpackage.l26
                                            public final Object z(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                h7d.g(j09Var, j3, i13, str3, f3, (l46) obj, k99.P(i2 | 1), i3);
                                                return wef.a;
                                            }
                                        };
                                    }
                                }
                                i7 |= 3072;
                                str2 = str;
                                i10 = i3 & 16;
                                if (i10 != 0) {
                                    i12 = i7 | 24576;
                                    f2 = f;
                                } else {
                                    f2 = f;
                                    if (l46Var2.d(f2)) {
                                        i11 = 16384;
                                    } else {
                                        i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                    }
                                    i12 = i7 | i11;
                                }
                                if ((i12 & 9363) != 9362) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (l46Var2.W(i12 & 1, z)) {
                                    l46Var2.b0();
                                    if ((i2 & 1) != 0) {
                                        if ((i3 & 2) != 0) {
                                            j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                            i12 &= -113;
                                        }
                                        if ((i3 & 4) != 0) {
                                            i12 &= -897;
                                            i5 = R.string.share_qr_code_tips;
                                        }
                                        if (i8 != 0) {
                                            str2 = Constants.LONG;
                                        }
                                        if (i10 != 0) {
                                            i14 = i12;
                                            j4 = j2;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = 1.0f;
                                        } else {
                                            i14 = i12;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = f2;
                                            j4 = j2;
                                        }
                                    } else {
                                        if ((i3 & 2) != 0) {
                                            j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                            i12 &= -113;
                                        }
                                        if ((i3 & 4) != 0) {
                                            i12 &= -897;
                                            i5 = R.string.share_qr_code_tips;
                                        }
                                        if (i8 != 0) {
                                            str2 = Constants.LONG;
                                        }
                                        if (i10 != 0) {
                                            i14 = i12;
                                            j4 = j2;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = 1.0f;
                                        } else {
                                            i14 = i12;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = f2;
                                            j4 = j2;
                                        }
                                    }
                                    l46Var2.s();
                                    str5 = (String) l46Var2.k(vgb.c);
                                    iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                    zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                    objR = l46Var2.R();
                                    i8cVar = sf2.a;
                                    if (zG) {
                                        if (str5 != null) {
                                            ksVarA = vgb.a(iD0, str5);
                                        } else {
                                            ksVarA = null;
                                        }
                                        objR = ksVarA;
                                        l46Var2.p0(objR);
                                    } else {
                                        if (str5 != null) {
                                            ksVarA = vgb.a(iD0, str5);
                                        } else {
                                            ksVarA = null;
                                        }
                                        objR = ksVarA;
                                        l46Var2.p0(objR);
                                    }
                                    cv6Var = (cv6) objR;
                                    y6cVarB = a7c.b(8.0f);
                                    c92 c92VarA5 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                    int iHashCode9 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM9 = l46Var2.m();
                                    j09 j09VarJ9 = m93.J(l46Var2, j09Var);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    z2 = l46Var2.S;
                                    ov7Var = LayoutNode.h1;
                                    if (z2) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    he2Var = hj6.z;
                                    dec.l(he2Var, l46Var2, c92VarA5);
                                    he2Var2 = hj6.y;
                                    dec.l(he2Var2, l46Var2, u8aVarM9);
                                    Integer numValueOf5 = Integer.valueOf(iHashCode9);
                                    he2Var3 = hj6.X;
                                    dec.l(he2Var3, l46Var2, numValueOf5);
                                    dec.k(l46Var2);
                                    he2Var4 = hj6.x;
                                    dec.l(he2Var4, l46Var2, j09VarJ9);
                                    if (str5 != null) {
                                        l46Var2.f0(2092528646);
                                        l46Var2.r(false);
                                        z3 = true;
                                    } else {
                                        l46Var2.f0(760238228);
                                        z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                        l46Var2.r(false);
                                    }
                                    if (z3) {
                                        l46Var2.f0(2092595338);
                                        g09Var = g09.a;
                                        j09 j09VarL5 = b.l(g09Var, 56.0f);
                                        objR2 = l46Var2.R();
                                        if (objR2 == i8cVar) {
                                            objR2 = new e2d(11);
                                            l46Var2.p0(objR2);
                                        }
                                        j09 j09VarO5 = tm7.o(oa7.E(vwc.b(j09VarL5, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                        xn8 xn8VarC5 = s21.c(ndb.f, false);
                                        int iHashCode10 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM10 = l46Var2.m();
                                        j09 j09VarJ10 = m93.J(l46Var2, j09VarO5);
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(he2Var, l46Var2, xn8VarC5);
                                        dec.l(he2Var2, l46Var2, u8aVarM10);
                                        ib8.s(iHashCode10, l46Var2, he2Var3, l46Var2);
                                        dec.l(he2Var4, l46Var2, j09VarJ10);
                                        if (cv6Var != null) {
                                            l46Var2.f0(-1417416064);
                                            str6 = str5;
                                            feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                            z5 = false;
                                            l46Var2.r(false);
                                        } else {
                                            str6 = str5;
                                            l46Var2.f0(924114454);
                                            a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                            z5 = false;
                                            l46Var2.r(false);
                                        }
                                        z4 = true;
                                        l46Var2.r(true);
                                        l46Var2.r(z5);
                                    } else {
                                        z4 = true;
                                        str6 = str5;
                                        l46Var2.f0(2093148874);
                                        l46Var2.r(false);
                                    }
                                    if (str6 != null) {
                                        i16 = R.string.share_reading_qr_tips;
                                    } else {
                                        i16 = i15;
                                    }
                                    String strQ5 = afc.q(i16, l46Var2);
                                    mue mueVar5 = pue.a;
                                    mue mueVarJ5 = pue.j(l46Var2);
                                    xtd xtdVar5 = mueVarJ5.a;
                                    float fN5 = mh3.n(f4, 0.0f, 1.0f);
                                    long j9 = j4;
                                    nte.b(strQ5, null, j9, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ5, 0L, w6c.r(4294967296L, wue.c(xtdVar5.b) * fN5), null, null, w6c.r(4294967296L, wue.c(xtdVar5.h) * fN5), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                    l46Var2 = l46Var;
                                    l46Var2.r(z4);
                                    f3 = f4;
                                    j3 = j9;
                                    i13 = i15;
                                    str3 = str4;
                                } else {
                                    l46Var2.Z();
                                    j3 = j2;
                                    i13 = i5;
                                    str3 = str2;
                                    f3 = f2;
                                }
                                ojbVarV = l46Var2.v();
                                if (ojbVarV != null) {
                                    ojbVarV.d = new l26() { // from class: z6d
                                        @Override // defpackage.l26
                                        public final Object z(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            h7d.g(j09Var, j3, i13, str3, f3, (l46) obj, k99.P(i2 | 1), i3);
                                            return wef.a;
                                        }
                                    };
                                }
                            }
                            j2 = j;
                            int i19 = i4 | i17;
                            if ((i3 & 4) == 0) {
                                i5 = i;
                                if (l46Var2.e(i5)) {
                                    i6 = 256;
                                }
                                i7 = i19 | i6;
                                i8 = i3 & 8;
                                if (i8 != 0) {
                                    if ((i2 & 3072) == 0) {
                                        str2 = str;
                                        if (l46Var2.g(str2)) {
                                            i9 = 2048;
                                        } else {
                                            i9 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                                        }
                                        i7 |= i9;
                                    }
                                    i10 = i3 & 16;
                                    if (i10 != 0) {
                                        i12 = i7 | 24576;
                                        f2 = f;
                                    } else {
                                        f2 = f;
                                        if (l46Var2.d(f2)) {
                                            i11 = 16384;
                                        } else {
                                            i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                        }
                                        i12 = i7 | i11;
                                    }
                                    if ((i12 & 9363) != 9362) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (l46Var2.W(i12 & 1, z)) {
                                        l46Var2.b0();
                                        if ((i2 & 1) != 0) {
                                            if ((i3 & 2) != 0) {
                                                j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                                i12 &= -113;
                                            }
                                            if ((i3 & 4) != 0) {
                                                i12 &= -897;
                                                i5 = R.string.share_qr_code_tips;
                                            }
                                            if (i8 != 0) {
                                                str2 = Constants.LONG;
                                            }
                                            if (i10 != 0) {
                                                i14 = i12;
                                                j4 = j2;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = 1.0f;
                                            } else {
                                                i14 = i12;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = f2;
                                                j4 = j2;
                                            }
                                        } else {
                                            if ((i3 & 2) != 0) {
                                                j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                                i12 &= -113;
                                            }
                                            if ((i3 & 4) != 0) {
                                                i12 &= -897;
                                                i5 = R.string.share_qr_code_tips;
                                            }
                                            if (i8 != 0) {
                                                str2 = Constants.LONG;
                                            }
                                            if (i10 != 0) {
                                                i14 = i12;
                                                j4 = j2;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = 1.0f;
                                            } else {
                                                i14 = i12;
                                                i15 = i5;
                                                str4 = str2;
                                                f4 = f2;
                                                j4 = j2;
                                            }
                                        }
                                        l46Var2.s();
                                        str5 = (String) l46Var2.k(vgb.c);
                                        iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                        zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                        objR = l46Var2.R();
                                        i8cVar = sf2.a;
                                        if (zG) {
                                            if (str5 != null) {
                                                ksVarA = vgb.a(iD0, str5);
                                            } else {
                                                ksVarA = null;
                                            }
                                            objR = ksVarA;
                                            l46Var2.p0(objR);
                                        } else {
                                            if (str5 != null) {
                                                ksVarA = vgb.a(iD0, str5);
                                            } else {
                                                ksVarA = null;
                                            }
                                            objR = ksVarA;
                                            l46Var2.p0(objR);
                                        }
                                        cv6Var = (cv6) objR;
                                        y6cVarB = a7c.b(8.0f);
                                        c92 c92VarA6 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                        int iHashCode11 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM11 = l46Var2.m();
                                        j09 j09VarJ11 = m93.J(l46Var2, j09Var);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        z2 = l46Var2.S;
                                        ov7Var = LayoutNode.h1;
                                        if (z2) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        he2Var = hj6.z;
                                        dec.l(he2Var, l46Var2, c92VarA6);
                                        he2Var2 = hj6.y;
                                        dec.l(he2Var2, l46Var2, u8aVarM11);
                                        Integer numValueOf6 = Integer.valueOf(iHashCode11);
                                        he2Var3 = hj6.X;
                                        dec.l(he2Var3, l46Var2, numValueOf6);
                                        dec.k(l46Var2);
                                        he2Var4 = hj6.x;
                                        dec.l(he2Var4, l46Var2, j09VarJ11);
                                        if (str5 != null) {
                                            l46Var2.f0(2092528646);
                                            l46Var2.r(false);
                                            z3 = true;
                                        } else {
                                            l46Var2.f0(760238228);
                                            z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                            l46Var2.r(false);
                                        }
                                        if (z3) {
                                            l46Var2.f0(2092595338);
                                            g09Var = g09.a;
                                            j09 j09VarL6 = b.l(g09Var, 56.0f);
                                            objR2 = l46Var2.R();
                                            if (objR2 == i8cVar) {
                                                objR2 = new e2d(11);
                                                l46Var2.p0(objR2);
                                            }
                                            j09 j09VarO6 = tm7.o(oa7.E(vwc.b(j09VarL6, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                            xn8 xn8VarC6 = s21.c(ndb.f, false);
                                            int iHashCode12 = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM12 = l46Var2.m();
                                            j09 j09VarJ12 = m93.J(l46Var2, j09VarO6);
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(ov7Var);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(he2Var, l46Var2, xn8VarC6);
                                            dec.l(he2Var2, l46Var2, u8aVarM12);
                                            ib8.s(iHashCode12, l46Var2, he2Var3, l46Var2);
                                            dec.l(he2Var4, l46Var2, j09VarJ12);
                                            if (cv6Var != null) {
                                                l46Var2.f0(-1417416064);
                                                str6 = str5;
                                                feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                                z5 = false;
                                                l46Var2.r(false);
                                            } else {
                                                str6 = str5;
                                                l46Var2.f0(924114454);
                                                a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                                z5 = false;
                                                l46Var2.r(false);
                                            }
                                            z4 = true;
                                            l46Var2.r(true);
                                            l46Var2.r(z5);
                                        } else {
                                            z4 = true;
                                            str6 = str5;
                                            l46Var2.f0(2093148874);
                                            l46Var2.r(false);
                                        }
                                        if (str6 != null) {
                                            i16 = R.string.share_reading_qr_tips;
                                        } else {
                                            i16 = i15;
                                        }
                                        String strQ6 = afc.q(i16, l46Var2);
                                        mue mueVar6 = pue.a;
                                        mue mueVarJ6 = pue.j(l46Var2);
                                        xtd xtdVar6 = mueVarJ6.a;
                                        float fN6 = mh3.n(f4, 0.0f, 1.0f);
                                        long j10 = j4;
                                        nte.b(strQ6, null, j10, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ6, 0L, w6c.r(4294967296L, wue.c(xtdVar6.b) * fN6), null, null, w6c.r(4294967296L, wue.c(xtdVar6.h) * fN6), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                        l46Var2 = l46Var;
                                        l46Var2.r(z4);
                                        f3 = f4;
                                        j3 = j10;
                                        i13 = i15;
                                        str3 = str4;
                                    } else {
                                        l46Var2.Z();
                                        j3 = j2;
                                        i13 = i5;
                                        str3 = str2;
                                        f3 = f2;
                                    }
                                    ojbVarV = l46Var2.v();
                                    if (ojbVarV != null) {
                                        ojbVarV.d = new l26() { // from class: z6d
                                            @Override // defpackage.l26
                                            public final Object z(Object obj, Object obj2) {
                                                ((Integer) obj2).getClass();
                                                h7d.g(j09Var, j3, i13, str3, f3, (l46) obj, k99.P(i2 | 1), i3);
                                                return wef.a;
                                            }
                                        };
                                    }
                                }
                                i7 |= 3072;
                                str2 = str;
                                i10 = i3 & 16;
                                if (i10 != 0) {
                                    i12 = i7 | 24576;
                                    f2 = f;
                                } else {
                                    f2 = f;
                                    if (l46Var2.d(f2)) {
                                        i11 = 16384;
                                    } else {
                                        i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                    }
                                    i12 = i7 | i11;
                                }
                                if ((i12 & 9363) != 9362) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (l46Var2.W(i12 & 1, z)) {
                                    l46Var2.b0();
                                    if ((i2 & 1) != 0) {
                                        if ((i3 & 2) != 0) {
                                            j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                            i12 &= -113;
                                        }
                                        if ((i3 & 4) != 0) {
                                            i12 &= -897;
                                            i5 = R.string.share_qr_code_tips;
                                        }
                                        if (i8 != 0) {
                                            str2 = Constants.LONG;
                                        }
                                        if (i10 != 0) {
                                            i14 = i12;
                                            j4 = j2;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = 1.0f;
                                        } else {
                                            i14 = i12;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = f2;
                                            j4 = j2;
                                        }
                                    } else {
                                        if ((i3 & 2) != 0) {
                                            j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                            i12 &= -113;
                                        }
                                        if ((i3 & 4) != 0) {
                                            i12 &= -897;
                                            i5 = R.string.share_qr_code_tips;
                                        }
                                        if (i8 != 0) {
                                            str2 = Constants.LONG;
                                        }
                                        if (i10 != 0) {
                                            i14 = i12;
                                            j4 = j2;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = 1.0f;
                                        } else {
                                            i14 = i12;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = f2;
                                            j4 = j2;
                                        }
                                    }
                                    l46Var2.s();
                                    str5 = (String) l46Var2.k(vgb.c);
                                    iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                    zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                    objR = l46Var2.R();
                                    i8cVar = sf2.a;
                                    if (zG) {
                                        if (str5 != null) {
                                            ksVarA = vgb.a(iD0, str5);
                                        } else {
                                            ksVarA = null;
                                        }
                                        objR = ksVarA;
                                        l46Var2.p0(objR);
                                    } else {
                                        if (str5 != null) {
                                            ksVarA = vgb.a(iD0, str5);
                                        } else {
                                            ksVarA = null;
                                        }
                                        objR = ksVarA;
                                        l46Var2.p0(objR);
                                    }
                                    cv6Var = (cv6) objR;
                                    y6cVarB = a7c.b(8.0f);
                                    c92 c92VarA7 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                    int iHashCode13 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM13 = l46Var2.m();
                                    j09 j09VarJ13 = m93.J(l46Var2, j09Var);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    z2 = l46Var2.S;
                                    ov7Var = LayoutNode.h1;
                                    if (z2) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    he2Var = hj6.z;
                                    dec.l(he2Var, l46Var2, c92VarA7);
                                    he2Var2 = hj6.y;
                                    dec.l(he2Var2, l46Var2, u8aVarM13);
                                    Integer numValueOf7 = Integer.valueOf(iHashCode13);
                                    he2Var3 = hj6.X;
                                    dec.l(he2Var3, l46Var2, numValueOf7);
                                    dec.k(l46Var2);
                                    he2Var4 = hj6.x;
                                    dec.l(he2Var4, l46Var2, j09VarJ13);
                                    if (str5 != null) {
                                        l46Var2.f0(2092528646);
                                        l46Var2.r(false);
                                        z3 = true;
                                    } else {
                                        l46Var2.f0(760238228);
                                        z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                        l46Var2.r(false);
                                    }
                                    if (z3) {
                                        l46Var2.f0(2092595338);
                                        g09Var = g09.a;
                                        j09 j09VarL7 = b.l(g09Var, 56.0f);
                                        objR2 = l46Var2.R();
                                        if (objR2 == i8cVar) {
                                            objR2 = new e2d(11);
                                            l46Var2.p0(objR2);
                                        }
                                        j09 j09VarO7 = tm7.o(oa7.E(vwc.b(j09VarL7, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                        xn8 xn8VarC7 = s21.c(ndb.f, false);
                                        int iHashCode14 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM14 = l46Var2.m();
                                        j09 j09VarJ14 = m93.J(l46Var2, j09VarO7);
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(he2Var, l46Var2, xn8VarC7);
                                        dec.l(he2Var2, l46Var2, u8aVarM14);
                                        ib8.s(iHashCode14, l46Var2, he2Var3, l46Var2);
                                        dec.l(he2Var4, l46Var2, j09VarJ14);
                                        if (cv6Var != null) {
                                            l46Var2.f0(-1417416064);
                                            str6 = str5;
                                            feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                            z5 = false;
                                            l46Var2.r(false);
                                        } else {
                                            str6 = str5;
                                            l46Var2.f0(924114454);
                                            a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                            z5 = false;
                                            l46Var2.r(false);
                                        }
                                        z4 = true;
                                        l46Var2.r(true);
                                        l46Var2.r(z5);
                                    } else {
                                        z4 = true;
                                        str6 = str5;
                                        l46Var2.f0(2093148874);
                                        l46Var2.r(false);
                                    }
                                    if (str6 != null) {
                                        i16 = R.string.share_reading_qr_tips;
                                    } else {
                                        i16 = i15;
                                    }
                                    String strQ7 = afc.q(i16, l46Var2);
                                    mue mueVar7 = pue.a;
                                    mue mueVarJ7 = pue.j(l46Var2);
                                    xtd xtdVar7 = mueVarJ7.a;
                                    float fN7 = mh3.n(f4, 0.0f, 1.0f);
                                    long j11 = j4;
                                    nte.b(strQ7, null, j11, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ7, 0L, w6c.r(4294967296L, wue.c(xtdVar7.b) * fN7), null, null, w6c.r(4294967296L, wue.c(xtdVar7.h) * fN7), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                    l46Var2 = l46Var;
                                    l46Var2.r(z4);
                                    f3 = f4;
                                    j3 = j11;
                                    i13 = i15;
                                    str3 = str4;
                                } else {
                                    l46Var2.Z();
                                    j3 = j2;
                                    i13 = i5;
                                    str3 = str2;
                                    f3 = f2;
                                }
                                ojbVarV = l46Var2.v();
                                if (ojbVarV != null) {
                                    ojbVarV.d = new l26() { // from class: z6d
                                        @Override // defpackage.l26
                                        public final Object z(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            h7d.g(j09Var, j3, i13, str3, f3, (l46) obj, k99.P(i2 | 1), i3);
                                            return wef.a;
                                        }
                                    };
                                }
                            }
                            i5 = i;
                            i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            i7 = i19 | i6;
                            i8 = i3 & 8;
                            if (i8 != 0) {
                                if ((i2 & 3072) == 0) {
                                    str2 = str;
                                    if (l46Var2.g(str2)) {
                                        i9 = 2048;
                                    } else {
                                        i9 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                                    }
                                    i7 |= i9;
                                }
                                i10 = i3 & 16;
                                if (i10 != 0) {
                                    i12 = i7 | 24576;
                                    f2 = f;
                                } else {
                                    f2 = f;
                                    if (l46Var2.d(f2)) {
                                        i11 = 16384;
                                    } else {
                                        i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                    }
                                    i12 = i7 | i11;
                                }
                                if ((i12 & 9363) != 9362) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (l46Var2.W(i12 & 1, z)) {
                                    l46Var2.b0();
                                    if ((i2 & 1) != 0) {
                                        if ((i3 & 2) != 0) {
                                            j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                            i12 &= -113;
                                        }
                                        if ((i3 & 4) != 0) {
                                            i12 &= -897;
                                            i5 = R.string.share_qr_code_tips;
                                        }
                                        if (i8 != 0) {
                                            str2 = Constants.LONG;
                                        }
                                        if (i10 != 0) {
                                            i14 = i12;
                                            j4 = j2;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = 1.0f;
                                        } else {
                                            i14 = i12;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = f2;
                                            j4 = j2;
                                        }
                                    } else {
                                        if ((i3 & 2) != 0) {
                                            j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                            i12 &= -113;
                                        }
                                        if ((i3 & 4) != 0) {
                                            i12 &= -897;
                                            i5 = R.string.share_qr_code_tips;
                                        }
                                        if (i8 != 0) {
                                            str2 = Constants.LONG;
                                        }
                                        if (i10 != 0) {
                                            i14 = i12;
                                            j4 = j2;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = 1.0f;
                                        } else {
                                            i14 = i12;
                                            i15 = i5;
                                            str4 = str2;
                                            f4 = f2;
                                            j4 = j2;
                                        }
                                    }
                                    l46Var2.s();
                                    str5 = (String) l46Var2.k(vgb.c);
                                    iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                    zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                    objR = l46Var2.R();
                                    i8cVar = sf2.a;
                                    if (zG) {
                                        if (str5 != null) {
                                            ksVarA = vgb.a(iD0, str5);
                                        } else {
                                            ksVarA = null;
                                        }
                                        objR = ksVarA;
                                        l46Var2.p0(objR);
                                    } else {
                                        if (str5 != null) {
                                            ksVarA = vgb.a(iD0, str5);
                                        } else {
                                            ksVarA = null;
                                        }
                                        objR = ksVarA;
                                        l46Var2.p0(objR);
                                    }
                                    cv6Var = (cv6) objR;
                                    y6cVarB = a7c.b(8.0f);
                                    c92 c92VarA8 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                    int iHashCode15 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM15 = l46Var2.m();
                                    j09 j09VarJ15 = m93.J(l46Var2, j09Var);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    z2 = l46Var2.S;
                                    ov7Var = LayoutNode.h1;
                                    if (z2) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    he2Var = hj6.z;
                                    dec.l(he2Var, l46Var2, c92VarA8);
                                    he2Var2 = hj6.y;
                                    dec.l(he2Var2, l46Var2, u8aVarM15);
                                    Integer numValueOf8 = Integer.valueOf(iHashCode15);
                                    he2Var3 = hj6.X;
                                    dec.l(he2Var3, l46Var2, numValueOf8);
                                    dec.k(l46Var2);
                                    he2Var4 = hj6.x;
                                    dec.l(he2Var4, l46Var2, j09VarJ15);
                                    if (str5 != null) {
                                        l46Var2.f0(2092528646);
                                        l46Var2.r(false);
                                        z3 = true;
                                    } else {
                                        l46Var2.f0(760238228);
                                        z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                        l46Var2.r(false);
                                    }
                                    if (z3) {
                                        l46Var2.f0(2092595338);
                                        g09Var = g09.a;
                                        j09 j09VarL8 = b.l(g09Var, 56.0f);
                                        objR2 = l46Var2.R();
                                        if (objR2 == i8cVar) {
                                            objR2 = new e2d(11);
                                            l46Var2.p0(objR2);
                                        }
                                        j09 j09VarO8 = tm7.o(oa7.E(vwc.b(j09VarL8, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                        xn8 xn8VarC8 = s21.c(ndb.f, false);
                                        int iHashCode16 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM16 = l46Var2.m();
                                        j09 j09VarJ16 = m93.J(l46Var2, j09VarO8);
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(he2Var, l46Var2, xn8VarC8);
                                        dec.l(he2Var2, l46Var2, u8aVarM16);
                                        ib8.s(iHashCode16, l46Var2, he2Var3, l46Var2);
                                        dec.l(he2Var4, l46Var2, j09VarJ16);
                                        if (cv6Var != null) {
                                            l46Var2.f0(-1417416064);
                                            str6 = str5;
                                            feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                            z5 = false;
                                            l46Var2.r(false);
                                        } else {
                                            str6 = str5;
                                            l46Var2.f0(924114454);
                                            a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                            z5 = false;
                                            l46Var2.r(false);
                                        }
                                        z4 = true;
                                        l46Var2.r(true);
                                        l46Var2.r(z5);
                                    } else {
                                        z4 = true;
                                        str6 = str5;
                                        l46Var2.f0(2093148874);
                                        l46Var2.r(false);
                                    }
                                    if (str6 != null) {
                                        i16 = R.string.share_reading_qr_tips;
                                    } else {
                                        i16 = i15;
                                    }
                                    String strQ8 = afc.q(i16, l46Var2);
                                    mue mueVar8 = pue.a;
                                    mue mueVarJ8 = pue.j(l46Var2);
                                    xtd xtdVar8 = mueVarJ8.a;
                                    float fN8 = mh3.n(f4, 0.0f, 1.0f);
                                    long j12 = j4;
                                    nte.b(strQ8, null, j12, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ8, 0L, w6c.r(4294967296L, wue.c(xtdVar8.b) * fN8), null, null, w6c.r(4294967296L, wue.c(xtdVar8.h) * fN8), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                    l46Var2 = l46Var;
                                    l46Var2.r(z4);
                                    f3 = f4;
                                    j3 = j12;
                                    i13 = i15;
                                    str3 = str4;
                                } else {
                                    l46Var2.Z();
                                    j3 = j2;
                                    i13 = i5;
                                    str3 = str2;
                                    f3 = f2;
                                }
                                ojbVarV = l46Var2.v();
                                if (ojbVarV != null) {
                                    ojbVarV.d = new l26() { // from class: z6d
                                        @Override // defpackage.l26
                                        public final Object z(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            h7d.g(j09Var, j3, i13, str3, f3, (l46) obj, k99.P(i2 | 1), i3);
                                            return wef.a;
                                        }
                                    };
                                }
                            }
                            i7 |= 3072;
                            str2 = str;
                            i10 = i3 & 16;
                            if (i10 != 0) {
                                i12 = i7 | 24576;
                                f2 = f;
                            } else {
                                f2 = f;
                                if (l46Var2.d(f2)) {
                                    i11 = 16384;
                                } else {
                                    i11 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                                }
                                i12 = i7 | i11;
                            }
                            if ((i12 & 9363) != 9362) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (l46Var2.W(i12 & 1, z)) {
                                l46Var2.b0();
                                if ((i2 & 1) != 0) {
                                    if ((i3 & 2) != 0) {
                                        j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                        i12 &= -113;
                                    }
                                    if ((i3 & 4) != 0) {
                                        i12 &= -897;
                                        i5 = R.string.share_qr_code_tips;
                                    }
                                    if (i8 != 0) {
                                        str2 = Constants.LONG;
                                    }
                                    if (i10 != 0) {
                                        i14 = i12;
                                        j4 = j2;
                                        i15 = i5;
                                        str4 = str2;
                                        f4 = 1.0f;
                                    } else {
                                        i14 = i12;
                                        i15 = i5;
                                        str4 = str2;
                                        f4 = f2;
                                        j4 = j2;
                                    }
                                } else {
                                    if ((i3 & 2) != 0) {
                                        j2 = ((e8b) l46Var2.k(l8b.a)).q;
                                        i12 &= -113;
                                    }
                                    if ((i3 & 4) != 0) {
                                        i12 &= -897;
                                        i5 = R.string.share_qr_code_tips;
                                    }
                                    if (i8 != 0) {
                                        str2 = Constants.LONG;
                                    }
                                    if (i10 != 0) {
                                        i14 = i12;
                                        j4 = j2;
                                        i15 = i5;
                                        str4 = str2;
                                        f4 = 1.0f;
                                    } else {
                                        i14 = i12;
                                        i15 = i5;
                                        str4 = str2;
                                        f4 = f2;
                                        j4 = j2;
                                    }
                                }
                                l46Var2.s();
                                str5 = (String) l46Var2.k(vgb.c);
                                iD0 = ((sw3) l46Var2.k(zg2.h)).D0(52.0f);
                                zG = l46Var2.g(str5) | l46Var2.e(iD0);
                                objR = l46Var2.R();
                                i8cVar = sf2.a;
                                if (zG) {
                                    if (str5 != null) {
                                        ksVarA = vgb.a(iD0, str5);
                                    } else {
                                        ksVarA = null;
                                    }
                                    objR = ksVarA;
                                    l46Var2.p0(objR);
                                } else {
                                    if (str5 != null) {
                                        ksVarA = vgb.a(iD0, str5);
                                    } else {
                                        ksVarA = null;
                                    }
                                    objR = ksVarA;
                                    l46Var2.p0(objR);
                                }
                                cv6Var = (cv6) objR;
                                y6cVarB = a7c.b(8.0f);
                                c92 c92VarA9 = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                                int iHashCode17 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM17 = l46Var2.m();
                                j09 j09VarJ17 = m93.J(l46Var2, j09Var);
                                lf2.q.getClass();
                                l46Var2.j0();
                                z2 = l46Var2.S;
                                ov7Var = LayoutNode.h1;
                                if (z2) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                he2Var = hj6.z;
                                dec.l(he2Var, l46Var2, c92VarA9);
                                he2Var2 = hj6.y;
                                dec.l(he2Var2, l46Var2, u8aVarM17);
                                Integer numValueOf9 = Integer.valueOf(iHashCode17);
                                he2Var3 = hj6.X;
                                dec.l(he2Var3, l46Var2, numValueOf9);
                                dec.k(l46Var2);
                                he2Var4 = hj6.x;
                                dec.l(he2Var4, l46Var2, j09VarJ17);
                                if (str5 != null) {
                                    l46Var2.f0(2092528646);
                                    l46Var2.r(false);
                                    z3 = true;
                                } else {
                                    l46Var2.f0(760238228);
                                    z3 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                                    l46Var2.r(false);
                                }
                                if (z3) {
                                    l46Var2.f0(2092595338);
                                    g09Var = g09.a;
                                    j09 j09VarL9 = b.l(g09Var, 56.0f);
                                    objR2 = l46Var2.R();
                                    if (objR2 == i8cVar) {
                                        objR2 = new e2d(11);
                                        l46Var2.p0(objR2);
                                    }
                                    j09 j09VarO9 = tm7.o(oa7.E(vwc.b(j09VarL9, false, (a26) objR2), y6cVarB), y72.e, g21.f);
                                    xn8 xn8VarC9 = s21.c(ndb.f, false);
                                    int iHashCode18 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM18 = l46Var2.m();
                                    j09 j09VarJ18 = m93.J(l46Var2, j09VarO9);
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(ov7Var);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(he2Var, l46Var2, xn8VarC9);
                                    dec.l(he2Var2, l46Var2, u8aVarM18);
                                    ib8.s(iHashCode18, l46Var2, he2Var3, l46Var2);
                                    dec.l(he2Var4, l46Var2, j09VarJ18);
                                    if (cv6Var != null) {
                                        l46Var2.f0(-1417416064);
                                        str6 = str5;
                                        feg.k(cv6Var, null, b.l(g09Var, 52.0f), null, 0, l46Var2, 432, 120);
                                        z5 = false;
                                        l46Var2.r(false);
                                    } else {
                                        str6 = str5;
                                        l46Var2.f0(924114454);
                                        a6c.c(((i14 >> 9) & 14) | 48, l46Var2, b.l(g09Var, 52.0f), str4);
                                        z5 = false;
                                        l46Var2.r(false);
                                    }
                                    z4 = true;
                                    l46Var2.r(true);
                                    l46Var2.r(z5);
                                } else {
                                    z4 = true;
                                    str6 = str5;
                                    l46Var2.f0(2093148874);
                                    l46Var2.r(false);
                                }
                                if (str6 != null) {
                                    i16 = R.string.share_reading_qr_tips;
                                } else {
                                    i16 = i15;
                                }
                                String strQ9 = afc.q(i16, l46Var2);
                                mue mueVar9 = pue.a;
                                mue mueVarJ9 = pue.j(l46Var2);
                                xtd xtdVar9 = mueVarJ9.a;
                                float fN9 = mh3.n(f4, 0.0f, 1.0f);
                                long j13 = j4;
                                nte.b(strQ9, null, j13, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarJ9, 0L, w6c.r(4294967296L, wue.c(xtdVar9.b) * fN9), null, null, w6c.r(4294967296L, wue.c(xtdVar9.h) * fN9), null, 0, 0L, null, null, 16777085), l46Var, (i14 << 3) & 896, 0, 131066);
                                l46Var2 = l46Var;
                                l46Var2.r(z4);
                                f3 = f4;
                                j3 = j13;
                                i13 = i15;
                                str3 = str4;
                            } else {
                                l46Var2.Z();
                                j3 = j2;
                                i13 = i5;
                                str3 = str2;
                                f3 = f2;
                            }
                            ojbVarV = l46Var2.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new l26() { // from class: z6d
                                    @Override // defpackage.l26
                                    public final Object z(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        h7d.g(j09Var, j3, i13, str3, f3, (l46) obj, k99.P(i2 | 1), i3);
                                        return wef.a;
                                    }
                                };
                            }
                        }

                        public static final void h(int i, int i2, l46 l46Var, j09 j09Var) {
                            int i3;
                            j09 j09Var2;
                            l46Var.h0(803011713);
                            int i4 = i2 & 1;
                            int i5 = 4;
                            if (i4 != 0) {
                                i3 = i | 6;
                            } else if ((i & 6) == 0) {
                                i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
                            } else {
                                i3 = i;
                            }
                            if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
                                j09Var2 = i4 != 0 ? g09.a : j09Var;
                                feg.j(od4.A(R.drawable.logo_quin_night, 0, l46Var), null, b.d(j09Var2, 36.0f), null, null, 0.0f, null, l46Var, 56, 120);
                            } else {
                                l46Var.Z();
                                j09Var2 = j09Var;
                            }
                            ojb ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new kc2(j09Var2, i, i2, i5);
                            }
                        }

                        public static final int i(e8d e8dVar) {
                            e8dVar.getClass();
                            int iOrdinal = e8dVar.ordinal();
                            if (iOrdinal == 0) {
                                return R.string.sharing_type_screenshot;
                            }
                            if (iOrdinal == 1) {
                                return R.string.sharing_type_card;
                            }
                            if (iOrdinal == 2) {
                                return R.string.sharing_type_long;
                            }
                            ap.c();
                            return 0;
                        }
                    }
