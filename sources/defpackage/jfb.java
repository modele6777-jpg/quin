package defpackage;

import ai.askquin.R;
import android.content.res.Configuration;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ReadingFeedbackTag;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jfb {
    static {
        t72.I(new ReadingFeedbackTag("inaccurate", "Inaccurate prediction"), new ReadingFeedbackTag("unclear", "Unclear explanation"), new ReadingFeedbackTag("too_short", "Too short"), new ReadingFeedbackTag("not_helpful", "Not helpful"), new ReadingFeedbackTag("repetitive", "Repetitive content"), new ReadingFeedbackTag("other", "Other"));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x010f  */
    /* JADX WARN: Code duplicated, block: B:75:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0169  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x020c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void a(ReadingFeedbackTag readingFeedbackTag, boolean z, boolean z2, x16 x16Var, j09 j09Var, l46 l46Var, int i, int i2) {
        int i3;
        j09 j09Var2;
        boolean z3;
        j09 j09Var3;
        ojb ojbVarV;
        j09 j09VarW;
        j09 j09Var4;
        long j;
        long j2;
        x4d x4dVarB;
        l46Var.h0(-940662551);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? l46Var.g(readingFeedbackTag) : l46Var.i(readingFeedbackTag) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                j09Var2 = j09Var;
                i3 |= l46Var.g(j09Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                j09VarW = g09.a;
                if (i4 != 0) {
                    j09Var4 = j09VarW;
                } else {
                    j09Var4 = j09Var2;
                }
                if (z2) {
                    l46Var.f0(-2033572620);
                    l46Var.r(false);
                    j = y72.j;
                } else if (z) {
                    l46Var.f0(-2033571438);
                    j = ((e8b) l46Var.k(l8b.a)).c;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-2033570506);
                    j = ((e8b) l46Var.k(l8b.a)).m;
                    l46Var.r(false);
                }
                if (!z && z2) {
                    l46Var.f0(-2033567858);
                    l46Var.r(false);
                    j2 = y72.e;
                } else if (z || z2) {
                    l46Var.f0(-2033565289);
                    j2 = ((e8b) l46Var.k(l8b.a)).q;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-2033566346);
                    j2 = ((e8b) l46Var.k(l8b.a)).u;
                    l46Var.r(false);
                }
                long j3 = j2;
                x4dVarB = a7c.b(16.0f);
                if (we6.e(l46Var)) {
                    x4dVarB = g21.f;
                }
                if (!z2 && z) {
                    l46Var.f0(-2033560493);
                    j09VarW = db6.w(j09VarW, 2.0f, ((e8b) l46Var.k(l8b.a)).q, x4dVarB);
                    l46Var.r(false);
                } else if (!z2 && !z) {
                    l46Var.f0(-2033557733);
                    j09VarW = db6.w(j09VarW, 0.5f, ((e8b) l46Var.k(l8b.a)).z, x4dVarB);
                    l46Var.r(false);
                } else if (z2 && z) {
                    l46Var.f0(-2033554734);
                    j09VarW = db6.w(j09VarW, 2.0f, ((e8b) l46Var.k(l8b.a)).u, x4dVarB);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-2033553039);
                    l46Var.r(false);
                }
                j09 j09VarA0 = ynb.a0(b.c(tm7.o(oa7.E(j09Var4, x4dVarB).D(j09VarW), j, x4dVarB), false, null, null, x16Var, 15), 6.0f, 10.0f);
                xn8 xn8VarC = s21.c(ndb.f, false);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarA0);
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
                String label = readingFeedbackTag.getLabel();
                mue mueVar = pue.a;
                nte.b(label, null, j3, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
                l46Var.r(true);
                j09Var3 = j09Var4;
            } else {
                l46Var.Z();
                j09Var3 = j09Var2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new k28(readingFeedbackTag, z, z2, x16Var, j09Var3, i, i2);
            }
        }
        i3 |= 24576;
        j09Var2 = j09Var;
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i3 & 1, z3)) {
            j09VarW = g09.a;
            if (i4 != 0) {
                j09Var4 = j09VarW;
            } else {
                j09Var4 = j09Var2;
            }
            if (z2) {
                l46Var.f0(-2033572620);
                l46Var.r(false);
                j = y72.j;
            } else if (z) {
                l46Var.f0(-2033571438);
                j = ((e8b) l46Var.k(l8b.a)).c;
                l46Var.r(false);
            } else {
                l46Var.f0(-2033570506);
                j = ((e8b) l46Var.k(l8b.a)).m;
                l46Var.r(false);
            }
            if (!z) {
                if (z) {
                    l46Var.f0(-2033565289);
                    j2 = ((e8b) l46Var.k(l8b.a)).q;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-2033565289);
                    j2 = ((e8b) l46Var.k(l8b.a)).q;
                    l46Var.r(false);
                }
            } else if (z) {
                l46Var.f0(-2033565289);
                j2 = ((e8b) l46Var.k(l8b.a)).q;
                l46Var.r(false);
            } else {
                l46Var.f0(-2033565289);
                j2 = ((e8b) l46Var.k(l8b.a)).q;
                l46Var.r(false);
            }
            long j4 = j2;
            x4dVarB = a7c.b(16.0f);
            if (we6.e(l46Var)) {
                x4dVarB = g21.f;
            }
            if (!z2) {
                if (!z2) {
                    if (z2) {
                        l46Var.f0(-2033553039);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-2033553039);
                        l46Var.r(false);
                    }
                } else if (z2) {
                    l46Var.f0(-2033553039);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-2033553039);
                    l46Var.r(false);
                }
            } else if (!z2) {
                if (z2) {
                    l46Var.f0(-2033553039);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-2033553039);
                    l46Var.r(false);
                }
            } else if (z2) {
                l46Var.f0(-2033553039);
                l46Var.r(false);
            } else {
                l46Var.f0(-2033553039);
                l46Var.r(false);
            }
            j09 j09VarA1 = ynb.a0(b.c(tm7.o(oa7.E(j09Var4, x4dVarB).D(j09VarW), j, x4dVarB), false, null, null, x16Var, 15), 6.0f, 10.0f);
            xn8 xn8VarC2 = s21.c(ndb.f, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarA1);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC2);
            dec.l(hj6.y, l46Var, u8aVarM2);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ2);
            String label2 = readingFeedbackTag.getLabel();
            mue mueVar2 = pue.a;
            nte.b(label2, null, j4, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            l46Var.r(true);
            j09Var3 = j09Var4;
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k28(readingFeedbackTag, z, z2, x16Var, j09Var3, i, i2);
        }
    }

    public static final void b(List list, List list2, boolean z, a26 a26Var, l46 l46Var, int i) {
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var.h0(-400079004);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? l46Var.g(list) : l46Var.i(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(list2) : l46Var.i(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zT = pa7.t(((Configuration) l46Var.k(uq.a)).getLocales().get(0).getLanguage(), "zh");
            g09 g09Var = g09.a;
            if (zT) {
                l46Var.f0(-219063356);
                j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarC);
                lf2.q.getClass();
                l46Var.j0();
                boolean z2 = l46Var.S;
                x16 x16Var = LayoutNode.h1;
                if (z2) {
                    l46Var.l(x16Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var4, l46Var, c92VarA);
                dec.l(he2Var3, l46Var, u8aVarM);
                ib8.s(iHashCode, l46Var, he2Var2, l46Var);
                dec.l(he2Var, l46Var, j09VarJ);
                l46Var.f0(1104973472);
                for (List list3 : s72.n0(list, 3)) {
                    j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var, 6);
                    List list4 = list3;
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarC2);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(x16Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var4, l46Var, t7cVarA);
                    dec.l(he2Var3, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var2, l46Var);
                    Iterator itS = kv2.s(l46Var, j09VarJ2, he2Var, 1886753208, list4);
                    while (itS.hasNext()) {
                        ReadingFeedbackTag readingFeedbackTag = (ReadingFeedbackTag) itS.next();
                        g09 g09Var2 = g09Var;
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        List list5 = list4;
                        jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        boolean zContains = list2.contains(readingFeedbackTag.getKey());
                        boolean zI = ((i2 & 7168) == 2048) | l46Var.i(readingFeedbackTag);
                        Object objR = l46Var.R();
                        if (zI || objR == sf2.a) {
                            objR = new efb(a26Var, readingFeedbackTag, 0);
                            l46Var.p0(objR);
                        }
                        a(readingFeedbackTag, zContains, z, (x16) objR, jw7Var, l46Var, ReadingFeedbackTag.$stable | (i2 & 896), 0);
                        list4 = list5;
                        i2 = i2;
                        he2Var = he2Var;
                        g09Var = g09Var2;
                    }
                    he2 he2Var5 = he2Var;
                    int i3 = i2;
                    g09 g09Var3 = g09Var;
                    l46Var.r(false);
                    l46Var.f0(1886764006);
                    int size = 3 - list4.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        o5c.f(l46Var, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    }
                    l46Var.r(false);
                    l46Var.r(true);
                    i2 = i3;
                    he2Var = he2Var5;
                    g09Var = g09Var3;
                }
                tec.s(l46Var, false, true, false);
            } else {
                l46Var.f0(-218187265);
                ynb.j(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), new uc0(8.0f, true, new qc0(0)), new uc0(8.0f, true, new qc0(0)), null, 0, 0, af1.b0(879738299, new ffb(list, list2, z, a26Var, 0), l46Var), l46Var, 1573302, 56);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(list, list2, z, a26Var, i);
        }
    }

    public static final void c(final boolean z, final List list, final x16 x16Var, final l26 l26Var, l46 l46Var, final int i) {
        ojb ojbVarV;
        l26 l26Var2;
        long j;
        list.getClass();
        x16Var.getClass();
        l26Var.getClass();
        l46Var.h0(258773359);
        int i2 = i | (l46Var.h(z) ? 4 : 2) | (l46Var.g(list) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(l26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                Object objR = l46Var.R();
                Object obj = sf2.a;
                if (objR == obj) {
                    objR = new z8b(9);
                    l46Var.p0(objR);
                }
                ted tedVarF = zz8.f(54, 0, (a26) objR, l46Var);
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = af1.E(l46Var);
                    l46Var.p0(objR2);
                }
                aw2 aw2Var = (aw2) objR2;
                b1b b1bVar = l8b.a;
                boolean zF = k8b.f((e8b) l46Var.k(b1bVar));
                Object objR3 = l46Var.R();
                if (objR3 == obj) {
                    objR3 = new jsd();
                    l46Var.p0(objR3);
                }
                jsd jsdVar = (jsd) objR3;
                use useVarO = n3d.o(null, l46Var, 3);
                Object objR4 = l46Var.R();
                if (objR4 == obj) {
                    objR4 = new fn8(new i7b(17));
                    l46Var.p0(objR4);
                }
                fn8 fn8Var = (fn8) objR4;
                if (zF) {
                    l46Var.f0(-426878216);
                    j = ((e8b) l46Var.k(b1bVar)).c;
                } else {
                    l46Var.f0(-426877506);
                    j = ((e8b) l46Var.k(b1bVar)).a;
                }
                l46Var.r(false);
                boolean zI = l46Var.i(aw2Var) | l46Var.g(tedVarF) | ((i2 & 896) == 256);
                Object objR5 = l46Var.R();
                if (zI || objR5 == obj) {
                    objR5 = new m50(aw2Var, tedVarF, x16Var, 5);
                    l46Var.p0(objR5);
                }
                x16 x16Var2 = (x16) objR5;
                j09 j09VarW = mh3.W(g09.a);
                x4d x4dVarD = a7c.d(24.0f, 24.0f, 0.0f, 12);
                if (we6.e(l46Var)) {
                    x4dVarD = g21.f;
                }
                zz8.a(x16Var2, j09VarW, tedVarF, 0.0f, false, x4dVarD, j, 0L, 0L, null, new b3b(26), null, af1.b0(-406144047, new cj3(list, jsdVar, useVarO, fn8Var, zF, x16Var2, aw2Var, tedVarF, l26Var), l46Var), l46Var, 0, 3078, 5016);
            } else {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i3 = 0;
                l26Var2 = new l26(z, list, x16Var, l26Var, i, i3) { // from class: dfb
                    public final /* synthetic */ int a;
                    public final /* synthetic */ boolean b;
                    public final /* synthetic */ List c;
                    public final /* synthetic */ x16 d;
                    public final /* synthetic */ l26 e;

                    {
                        this.a = i3;
                    }

                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        int i4 = this.a;
                        wef wefVar = wef.a;
                        switch (i4) {
                            case 0:
                                ((Integer) obj3).getClass();
                                int iP = k99.P(1);
                                jfb.c(this.b, this.c, this.d, this.e, (l46) obj2, iP);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                int iP2 = k99.P(1);
                                jfb.c(this.b, this.c, this.d, this.e, (l46) obj2, iP2);
                                break;
                        }
                        return wefVar;
                    }
                };
            }
            ojbVarV.d = l26Var2;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i4 = 1;
            l26Var2 = new l26(z, list, x16Var, l26Var, i, i4) { // from class: dfb
                public final /* synthetic */ int a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ List c;
                public final /* synthetic */ x16 d;
                public final /* synthetic */ l26 e;

                {
                    this.a = i4;
                }

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    int i5 = this.a;
                    wef wefVar = wef.a;
                    switch (i5) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iP = k99.P(1);
                            jfb.c(this.b, this.c, this.d, this.e, (l46) obj2, iP);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iP2 = k99.P(1);
                            jfb.c(this.b, this.c, this.d, this.e, (l46) obj2, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var2;
        }
    }

    public static final void d(List list, List list2, use useVar, u47 u47Var, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        he2 he2Var;
        boolean z2;
        float f;
        int i2;
        List list3;
        boolean z3;
        long jI;
        long jM;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1379738573);
        int i3 = i | (l46Var2.g(list) ? 4 : 2) | (l46Var2.g(useVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(x16Var) ? 131072 : 65536) | (l46Var2.i(x16Var2) ? 1048576 : 524288);
        if (l46Var2.W(i3 & 1, (i3 & 599187) != 599186)) {
            l46Var2.b0();
            if ((i & 1) != 0 && !l46Var2.C()) {
                l46Var2.Z();
            }
            l46Var2.s();
            g09 g09Var = g09.a;
            j09 j09VarL = mh3.L(mh3.N(eb3.w(mh3.d0(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), mh3.T(l46Var2), false, 14), b21.P(1.0f, 400.0f, 4, null), 2)));
            jx0 jx0Var = ndb.Z;
            sc0 sc0Var = xc0.c;
            c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarL);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var2 = hj6.z;
            dec.l(he2Var2, l46Var2, c92VarA);
            he2 he2Var3 = hj6.y;
            dec.l(he2Var3, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var4 = hj6.X;
            dec.l(he2Var4, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var5 = hj6.x;
            dec.l(he2Var5, l46Var2, j09VarJ);
            if (z) {
                l46Var2.f0(848580795);
                he2Var = he2Var5;
                f = 1.0f;
                i2 = 48;
                oa7.d(null, 0.5f, ((e8b) l46Var2.k(l8b.a)).z, l46Var2, 48, 1);
                z2 = false;
                l46Var2.r(false);
            } else {
                he2Var = he2Var5;
                z2 = false;
                f = 1.0f;
                i2 = 48;
                l46Var2.f0(848688427);
                l46Var2.r(false);
            }
            float f2 = f;
            he2 he2Var6 = he2Var;
            c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, new mq6(ndb.E0)), false, 0L, 0L, null, x16Var, l46Var, i3 & 458752, 30);
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, androidx.compose.foundation.layout.b.c(g09Var, f2), 2);
            c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var, i2);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarB0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var2, l46Var, c92VarA2);
            dec.l(he2Var3, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var4, l46Var);
            dec.l(he2Var6, l46Var, j09VarJ2);
            String strQ = afc.q(R.string.reading_feedback_popup_title, l46Var);
            mue mueVar = pue.a;
            nte.b(strQ, null, l8b.b(l46Var), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var), 0L, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, w6c.k(0.16d), null, 0, w6c.k(40.5d), null, null, 16645979), l46Var, 0, 0, 130042);
            nte.b(ks0.h(8.0f, R.string.reading_feedback_popup_subtitle, l46Var, l46Var, g09Var), null, l8b.d(l46Var), w6c.l(15), null, null, w6c.k(0.075d), null, new jme(3), w6c.l(24), 0, false, 0, 0, null, null, l46Var, 100687872, 48, 258794);
            o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 24.0f));
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                list3 = list2;
                z3 = false;
                objR = new gfb(list3, 0);
                l46Var.p0(objR);
            } else {
                list3 = list2;
                z3 = false;
            }
            b(list, list3, z, (a26) objR, l46Var, (i3 & 126) | ((i3 >> 6) & 896));
            o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 24.0f));
            if (z) {
                l46Var.f0(1296752528);
                jI = l8b.f(l46Var);
            } else {
                l46Var.f0(1296753422);
                jI = l8b.i(l46Var);
            }
            l46Var.r(z3);
            if (z) {
                l46Var.f0(1296755701);
                jM = l8b.l(l46Var);
            } else {
                l46Var.f0(1296756759);
                jM = l8b.m(l46Var);
            }
            l46Var.r(z3);
            long j = jM;
            j09 j09VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, f2), 168.0f);
            String strQ2 = afc.q(R.string.reading_feedback_text_placeholder, l46Var);
            mue mueVarE = pue.e(l46Var);
            long jC = l8b.c(l46Var);
            x4d x4dVarB = a7c.b(20.0f);
            if (we6.e(l46Var)) {
                x4dVarB = g21.f;
            }
            boolean z5 = z3;
            long j2 = jI;
            cn1.j(j09VarD, useVar, strQ2, mueVarE, jC, null, new xpe(10, 1), u47Var, null, qk6.v0(0L, 0L, 0L, j2, j2, 0L, 0L, 0L, j, j, 0L, 0L, 0L, l46Var, 2147477455), null, null, x4dVarB, false, 0.5f, 0.5f, l46Var, ((i3 >> 3) & 112) | 14155782, 224256, 3360);
            nte.b(ks0.h(24.0f, R.string.reading_feedback_privacy_notice, l46Var, l46Var, g09Var), null, l8b.c(l46Var), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 0, 0, 130042);
            o5c.f(l46Var, androidx.compose.foundation.layout.b.d(g09Var, 12.0f));
            boolean z6 = (list2.isEmpty() && v4e.Q(useVar.d().c)) ? z5 : true;
            j09 j09VarB = androidx.compose.foundation.layout.b.b(0.0f, 56.0f, androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 1);
            x4d x4dVar = eze.a(l46Var).a.a;
            bx9 bx9Var = v51.a;
            cgg.a(x16Var2, j09VarB, z6, x4dVar, z7f.X(l46Var), null, null, null, urg.l, l46Var, ((i3 >> 18) & 14) | 805306416, 480);
            l46Var2 = l46Var;
            o5c.f(l46Var2, androidx.compose.foundation.layout.b.d(g09Var, 24.0f));
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dj3(list, list2, useVar, u47Var, z, x16Var, x16Var2, i);
        }
    }
}
