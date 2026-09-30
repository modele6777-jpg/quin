package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class beb {
    static {
        t72.I(new TarotCardChoice(TarotCardType.THE_SUN, false, "Present"), new TarotCardChoice(TarotCardType.ACE_OF_CUPS, true, "Future"), new TarotCardChoice(TarotCardType.FIVE_OF_SWORDS, false, "Advice"));
        t72.I(new PatternData("Present", "Current situation"), new PatternData("Future", "What lies ahead"), new PatternData("Advice", "Guidance"));
    }

    public static final void a(TarotCardChoice tarotCardChoice, String str, boolean z, l26 l26Var, a26 a26Var, l46 l46Var, int i) {
        TarotCardChoice tarotCardChoice2;
        int i2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(450173645);
        int i3 = i | (l46Var2.g(tarotCardChoice) ? 4 : 2) | (l46Var2.g(str) ? 32 : 16) | (l46Var2.i(null) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(l26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var2.i(a26Var) ? 131072 : 65536);
        if (l46Var2.W(i3 & 1, (74899 & i3) != 74898)) {
            float f = z ? 72.0f : 40.0f;
            q03 q03Var = gs4.a;
            h0e h0eVarA = vx.a(f, b21.T(300, 0, q03Var, 2), "cardWidth", l46Var2, 384, 8);
            boolean z2 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new cxe();
                l46Var2.p0(objR);
            }
            cxe cxeVar = (cxe) objR;
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            j09 j09VarP = b.p(g09Var, ((yi4) h0eVarA.getValue()).a);
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = ib8.e(l46Var2);
            }
            t69 t69Var = (t69) objR2;
            boolean zI = ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384) | ((i3 & 14) == 4) | l46Var2.i(cxeVar) | ((458752 & i3) == 131072);
            Object objR3 = l46Var2.R();
            if (zI || objR3 == i8cVar) {
                i2 = i3;
                h20 h20Var = new h20(z, l26Var, tarotCardChoice, cxeVar, a26Var, 2);
                l46Var2.p0(h20Var);
                objR3 = h20Var;
            } else {
                i2 = i3;
            }
            b21.d(androidx.compose.foundation.b.b(j09VarP, t69Var, null, false, null, (x16) objR3, 28), tarotCardChoice, false, h(tarotCardChoice.getCard().getCardKey(), cxeVar, z2, l46Var2, 6), null, 0.0f, null, null, l46Var, ((i2 << 3) & 112) | 384 | ((i2 << 6) & 57344), 224);
            tarotCardChoice2 = tarotCardChoice;
            l46Var2 = l46Var;
            m93.b(e92.a, z, null, rw4.f(b21.T(300, 0, q03Var, 2), 2), rw4.g(b21.T(300, 0, q03Var, 2), 2), null, af1.b0(1104315291, new j41(str, tarotCardChoice2, h0eVarA, 18), l46Var2), l46Var2, 1572870 | ((i2 >> 6) & 112), 18);
            l46Var2.r(true);
        } else {
            tarotCardChoice2 = tarotCardChoice;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(tarotCardChoice2, str, z, l26Var, a26Var, i);
        }
    }

    public static final void b(bx9 bx9Var, dd4 dd4Var, l26 l26Var, boolean z, boolean z2, List list, l46 l46Var, int i, int i2) {
        List list2;
        int i3;
        boolean z3;
        boolean z4;
        l46 l46Var2 = l46Var;
        dd4Var.getClass();
        l26Var.getClass();
        l46Var2.h0(-731088881);
        int i4 = (l46Var2.g(dd4Var) ? 32 : 16) | i;
        l26 l26Var2 = l26Var;
        if ((i & 384) == 0) {
            i4 |= l46Var2.i(l26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        boolean z5 = z;
        if ((i & 3072) == 0) {
            i4 |= l46Var2.h(z5) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i4 |= l46Var2.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            list2 = list;
        } else {
            list2 = list;
            i3 = i4 | (l46Var2.g(list2) ? 131072 : 65536);
        }
        if (l46Var2.W(i3 & 1, (599187 & i3) != 599186)) {
            List list3 = i5 != 0 ? pu4.a : list2;
            if (z2) {
                l46Var2.f0(1798244267);
                boolean z6 = !((Boolean) l46Var2.k(h57.a)).booleanValue();
                l46Var2.r(false);
                z3 = z6;
            } else {
                l46Var2.f0(-89001334);
                l46Var2.r(false);
                z3 = false;
            }
            List listC1 = s72.c1(list3, 3);
            if (!(dd4Var instanceof ad4)) {
                throw tec.d(1798248447, l46Var2, false);
            }
            l46Var2.f0(-88815484);
            float f = bx9Var.b;
            float f2 = bx9Var.d;
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, f, 0.0f, f2, 5, g09Var);
            g09 g09Var2 = g09Var;
            j09 j09VarK = mh3.K(j09VarD0, mh3.T(l46Var2));
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarK);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            o5c.f(l46Var2, b.p(g09Var2, ynb.B(bx9Var, (cv7) l46Var2.k(zg2.n))));
            l46Var2.f0(-1304337144);
            List list4 = ((ad4) dd4Var).b;
            int size = list4.size();
            int i6 = 0;
            while (i6 < size) {
                f((TarotCardChoice) list4.get(i6), z3, z5, l26Var2, l46Var2, ((i3 << 3) & 7168) | ((i3 >> 3) & 896) | 24576);
                i6++;
                l26Var2 = l26Var;
                z5 = z;
                g09Var2 = g09Var2;
                list4 = list4;
            }
            boolean z7 = z3;
            g09 g09Var3 = g09Var2;
            l46Var2.r(false);
            if (listC1.isEmpty()) {
                z4 = false;
                l46Var2.f0(-1779040393);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1779415183);
                e(72.0f, 0.0f, 0L, l46Var2, 6, 6);
                int size2 = listC1.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    f((TarotCardChoice) listC1.get(i7), z7, z, l26Var, l46Var, ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | 24576);
                }
                l46Var2 = l46Var;
                z4 = false;
                l46Var2.r(false);
            }
            o5c.f(l46Var2, b.p(g09Var3, ynb.A(bx9Var, (cv7) l46Var2.k(zg2.n))));
            l46Var2.r(true);
            l46Var2.r(z4);
            list2 = list3;
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb0(bx9Var, dd4Var, l26Var, z, z2, list2, i, i2);
        }
    }

    public static final void c(bx9 bx9Var, dd4 dd4Var, l26 l26Var, a26 a26Var, List list, List list2, boolean z, a26 a26Var2, l46 l46Var, int i) {
        a26 a26Var3;
        dd4Var.getClass();
        l26Var.getClass();
        a26Var.getClass();
        l46Var.h0(-1197854568);
        int i2 = i | (l46Var.g(dd4Var) ? 32 : 16) | (l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(list) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(list2) ? 131072 : 65536) | (l46Var.h(z) ? 1048576 : 524288) | 100663296;
        if (l46Var.W(i2 & 1, (38347923 & i2) != 38347922)) {
            List listC1 = s72.c1(list, 3);
            if (!(dd4Var instanceof ad4)) {
                throw tec.d(-86985580, l46Var, false);
            }
            l46Var.f0(1598479325);
            c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
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
            nk8.d(ynb.d0(0.0f, bx9Var.b, 0.0f, bx9Var.d, 5, b.c(g09Var, 1.0f)), null, af1.b0(909284564, new g30(bx9Var, dd4Var, listC1, z, l26Var, a26Var, list2), l46Var), l46Var, 3072, 6);
            String strQ = afc.q(R.string.text_uncollapsed, l46Var);
            String strQ2 = afc.q(R.string.text_collapsed, l46Var);
            boolean z2 = (3670016 & i2) == 1048576;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                a26Var3 = a26Var2;
                objR = new oy1(5, a26Var3, z);
                l46Var.p0(objR);
            } else {
                a26Var3 = a26Var2;
            }
            abg.f(null, z, strQ, strQ2, (x16) objR, l46Var, (i2 >> 15) & 112);
            l46Var.r(true);
            l46Var.r(false);
        } else {
            a26Var3 = a26Var2;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p20(bx9Var, dd4Var, l26Var, a26Var, list, list2, z, a26Var3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011f A[LOOP:4: B:61:0x0119->B:63:0x011f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x0213  */
    /* JADX WARN: Code duplicated, block: B:83:0x0217  */
    /* JADX WARN: Code duplicated, block: B:86:0x0233  */
    /* JADX WARN: Code duplicated, block: B:88:0x0278  */
    /* JADX WARN: Code duplicated, block: B:89:0x027c  */
    /* JADX WARN: Code duplicated, block: B:92:0x029a A[LOOP:3: B:91:0x0298->B:92:0x029a, LOOP_END] */
    public static final void d(xw9 xw9Var, final dd4 dd4Var, final List list, final a26 a26Var, final float f, final float f2, float f3, long j, final float f4, final mue mueVar, final y72 y72Var, final List list2, l46 l46Var, final int i) {
        l46 l46Var2;
        final xw9 xw9Var2;
        final float f5;
        final long j2;
        int i2;
        xw9 xw9VarQ;
        final long j3;
        float f6;
        List list3;
        float f7;
        c78 c78Var;
        g09 g09Var;
        boolean z;
        ov7 ov7Var;
        int iC;
        int i3;
        boolean z2;
        List list4;
        int i4;
        int size;
        int i5;
        Iterator it;
        int iIntValue;
        List list5;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        dd4Var.getClass();
        l46Var.h0(95826593);
        int i6 = i | 6 | (l46Var.g(dd4Var) ? 32 : 16);
        boolean zG = l46Var.g(list);
        int i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        int i8 = i6 | (zG ? 256 : 128) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.d(f) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | 46137344;
        he2 he2Var5 = he2Var3;
        int i9 = (l46Var.g(mueVar) ? 4 : 2) | (l46Var.g(y72Var) ? 32 : 16);
        if (l46Var.g(list2)) {
            i7 = 256;
        }
        int i10 = i9 | i7;
        if (l46Var.W(i8 & 1, ((i8 & 306783379) == 306783378 && (i10 & 147) == 146) ? false : true)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                i2 = i8 & (-234881025);
                xw9VarQ = ynb.q(0.0f, 0.0f, 3);
                j3 = ((e8b) l46Var.k(l8b.a)).A;
                f6 = 1.0f;
            } else {
                l46Var.Z();
                xw9VarQ = xw9Var;
                i2 = i8 & (-234881025);
                f6 = f3;
                j3 = j;
            }
            l46Var.s();
            List listC1 = s72.c1(list, 3);
            if (!(dd4Var instanceof ad4)) {
                throw tec.d(1895065544, l46Var, false);
            }
            l46Var.f0(-1382452773);
            ArrayList arrayListQ0 = s72.Q0(((ad4) dd4Var).b, listC1);
            c78 c78VarN = null;
            if (list2 != null) {
                if (list2.isEmpty()) {
                    it = list2.iterator();
                    iIntValue = 0;
                    while (it.hasNext()) {
                        iIntValue = ((Number) it.next()).intValue() + iIntValue;
                    }
                    list3 = listC1;
                    if (iIntValue == arrayListQ0.size()) {
                    }
                } else {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            it = list2.iterator();
                            iIntValue = 0;
                            while (it.hasNext()) {
                                iIntValue = ((Number) it.next()).intValue() + iIntValue;
                            }
                            list3 = listC1;
                            list5 = iIntValue == arrayListQ0.size() ? list2 : null;
                        } else if (((Number) it2.next()).intValue() <= 0) {
                            list3 = listC1;
                        }
                    }
                }
                if (list5 != null) {
                    c78 c78VarW = t72.w();
                    Iterator it3 = list5.iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        float f8 = f6;
                        int iIntValue2 = ((Number) it3.next()).intValue() + i11;
                        c78VarW.add(arrayListQ0.subList(i11, iIntValue2));
                        i11 = iIntValue2;
                        f6 = f8;
                    }
                    f7 = f6;
                    c78VarN = c78VarW.n();
                }
                c78Var = c78VarN;
                g09Var = g09.a;
                if (c78Var == null) {
                    l46Var.f0(-1382258093);
                    final float f9 = f7;
                    final List list6 = list3;
                    ynb.j(ynb.Y(g09Var, xw9VarQ), new uc0(8.0f, true, new qc0(0)), new uc0(f2, true, new qc0(0)), null, 0, 0, af1.b0(769649817, new n26() { // from class: ydb
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            float f10;
                            a26 a26Var2;
                            float f11;
                            mue mueVar2;
                            y72 y72Var2;
                            l46 l46Var3 = (l46) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((en5) obj).getClass();
                            if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                l46Var3.f0(899100529);
                                List list7 = ((ad4) dd4Var).b;
                                int size2 = list7.size();
                                int i12 = 0;
                                while (true) {
                                    f10 = f;
                                    a26Var2 = a26Var;
                                    f11 = f4;
                                    mueVar2 = mueVar;
                                    y72Var2 = y72Var;
                                    if (i12 >= size2) {
                                        break;
                                    }
                                    beb.g((TarotCardChoice) list7.get(i12), f10, a26Var2, f11, mueVar2, y72Var2, l46Var3, 0);
                                    i12++;
                                }
                                float f12 = f11;
                                l46Var3.r(false);
                                List list8 = list6;
                                if (list8.isEmpty()) {
                                    l46Var3.f0(2103279081);
                                    l46Var3.r(false);
                                } else {
                                    l46Var3.f0(2102708247);
                                    beb.e(f10, f9, j3, l46Var3, 0, 0);
                                    int size3 = list8.size();
                                    int i13 = 0;
                                    while (i13 < size3) {
                                        float f13 = f12;
                                        beb.g((TarotCardChoice) list8.get(i13), f10, a26Var2, f13, mueVar2, y72Var2, l46Var3, 0);
                                        i13++;
                                        f12 = f13;
                                    }
                                    l46Var3.r(false);
                                }
                            } else {
                                l46Var3.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 1572864, 56);
                    l46Var2 = l46Var;
                    z2 = false;
                    l46Var2.r(false);
                    f7 = f9;
                } else {
                    l46Var2 = l46Var;
                    l46Var2.f0(-1381011459);
                    j09 j09VarY = ynb.Y(g09Var, xw9VarQ);
                    c92 c92VarA = a92.a(new uc0(f2, true, new qc0(0)), ndb.Y, l46Var2, 0);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarY);
                    lf2.q.getClass();
                    l46Var2.j0();
                    z = l46Var2.S;
                    ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var4, l46Var2, c92VarA);
                    dec.l(he2Var5, l46Var2, u8aVarM);
                    ib8.s(iHashCode, l46Var2, he2Var2, l46Var2);
                    dec.l(he2Var, l46Var2, j09VarJ);
                    l46Var2.f0(-1597929513);
                    iC = c78Var.c();
                    i3 = 0;
                    while (i3 < iC) {
                        list4 = (List) c78Var.get(i3);
                        j09 j09VarC = b.c(g09Var, 1.0f);
                        c78 c78Var2 = c78Var;
                        g09 g09Var2 = g09Var;
                        i4 = i10;
                        t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.Z)), ndb.y, l46Var2, 0);
                        he2 he2Var6 = he2Var;
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM2 = l46Var2.m();
                        j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var4, l46Var2, t7cVarA);
                        dec.l(he2Var5, l46Var2, u8aVarM2);
                        ib8.s(iHashCode2, l46Var2, he2Var2, l46Var2);
                        he2Var = he2Var6;
                        dec.l(he2Var, l46Var2, j09VarJ2);
                        l46Var2.f0(-1522786740);
                        i5 = 0;
                        for (size = list4.size(); i5 < size; size = size) {
                            int i12 = i4 << 12;
                            g((TarotCardChoice) list4.get(i5), f, a26Var, f4, mueVar, y72Var, l46Var2, (i12 & 458752) | ((i2 >> 9) & 112) | ((i2 >> 3) & 896) | 3072 | (i12 & 57344));
                            i5++;
                            he2Var5 = he2Var5;
                            i4 = i4;
                            list4 = list4;
                        }
                        l46Var2.r(false);
                        l46Var2.r(true);
                        i3++;
                        he2Var5 = he2Var5;
                        i10 = i4;
                        c78Var = c78Var2;
                        g09Var = g09Var2;
                    }
                    z2 = false;
                    tec.s(l46Var2, false, true, false);
                }
                l46Var2.r(z2);
                f5 = f7;
                xw9Var2 = xw9VarQ;
                j2 = j3;
            } else {
                list3 = listC1;
            }
            f7 = f6;
            c78Var = c78VarN;
            g09Var = g09.a;
            if (c78Var == null) {
                l46Var.f0(-1382258093);
                final float f10 = f7;
                final List list7 = list3;
                ynb.j(ynb.Y(g09Var, xw9VarQ), new uc0(8.0f, true, new qc0(0)), new uc0(f2, true, new qc0(0)), null, 0, 0, af1.b0(769649817, new n26() { // from class: ydb
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        float f11;
                        a26 a26Var2;
                        float f12;
                        mue mueVar2;
                        y72 y72Var2;
                        l46 l46Var3 = (l46) obj2;
                        int iIntValue3 = ((Integer) obj3).intValue();
                        ((en5) obj).getClass();
                        if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                            l46Var3.f0(899100529);
                            List list8 = ((ad4) dd4Var).b;
                            int size2 = list8.size();
                            int i13 = 0;
                            while (true) {
                                f11 = f;
                                a26Var2 = a26Var;
                                f12 = f4;
                                mueVar2 = mueVar;
                                y72Var2 = y72Var;
                                if (i13 >= size2) {
                                    break;
                                }
                                beb.g((TarotCardChoice) list8.get(i13), f11, a26Var2, f12, mueVar2, y72Var2, l46Var3, 0);
                                i13++;
                            }
                            float f13 = f12;
                            l46Var3.r(false);
                            List list9 = list7;
                            if (list9.isEmpty()) {
                                l46Var3.f0(2103279081);
                                l46Var3.r(false);
                            } else {
                                l46Var3.f0(2102708247);
                                beb.e(f11, f10, j3, l46Var3, 0, 0);
                                int size3 = list9.size();
                                int i14 = 0;
                                while (i14 < size3) {
                                    float f14 = f13;
                                    beb.g((TarotCardChoice) list9.get(i14), f11, a26Var2, f14, mueVar2, y72Var2, l46Var3, 0);
                                    i14++;
                                    f13 = f14;
                                }
                                l46Var3.r(false);
                            }
                        } else {
                            l46Var3.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 1572864, 56);
                l46Var2 = l46Var;
                z2 = false;
                l46Var2.r(false);
                f7 = f10;
            } else {
                l46Var2 = l46Var;
                l46Var2.f0(-1381011459);
                j09 j09VarY2 = ynb.Y(g09Var, xw9VarQ);
                c92 c92VarA2 = a92.a(new uc0(f2, true, new qc0(0)), ndb.Y, l46Var2, 0);
                int iHashCode3 = Long.hashCode(l46Var2.T);
                u8a u8aVarM3 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, j09VarY2);
                lf2.q.getClass();
                l46Var2.j0();
                z = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var4, l46Var2, c92VarA2);
                dec.l(he2Var5, l46Var2, u8aVarM3);
                ib8.s(iHashCode3, l46Var2, he2Var2, l46Var2);
                dec.l(he2Var, l46Var2, j09VarJ3);
                l46Var2.f0(-1597929513);
                iC = c78Var.c();
                i3 = 0;
                while (i3 < iC) {
                    list4 = (List) c78Var.get(i3);
                    j09 j09VarC2 = b.c(g09Var, 1.0f);
                    c78 c78Var3 = c78Var;
                    g09 g09Var3 = g09Var;
                    i4 = i10;
                    t7c t7cVarA2 = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.Z)), ndb.y, l46Var2, 0);
                    he2 he2Var7 = he2Var;
                    int iHashCode4 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM4 = l46Var2.m();
                    j09 j09VarJ4 = m93.J(l46Var2, j09VarC2);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var4, l46Var2, t7cVarA2);
                    dec.l(he2Var5, l46Var2, u8aVarM4);
                    ib8.s(iHashCode4, l46Var2, he2Var2, l46Var2);
                    he2Var = he2Var7;
                    dec.l(he2Var, l46Var2, j09VarJ4);
                    l46Var2.f0(-1522786740);
                    i5 = 0;
                    while (i5 < size) {
                        int i13 = i4 << 12;
                        g((TarotCardChoice) list4.get(i5), f, a26Var, f4, mueVar, y72Var, l46Var2, (i13 & 458752) | ((i2 >> 9) & 112) | ((i2 >> 3) & 896) | 3072 | (i13 & 57344));
                        i5++;
                        he2Var5 = he2Var5;
                        i4 = i4;
                        list4 = list4;
                    }
                    l46Var2.r(false);
                    l46Var2.r(true);
                    i3++;
                    he2Var5 = he2Var5;
                    i10 = i4;
                    c78Var = c78Var3;
                    g09Var = g09Var3;
                }
                z2 = false;
                tec.s(l46Var2, false, true, false);
            }
            l46Var2.r(z2);
            f5 = f7;
            xw9Var2 = xw9VarQ;
            j2 = j3;
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
            xw9Var2 = xw9Var;
            f5 = f3;
            j2 = j;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(dd4Var, list, a26Var, f, f2, f5, j2, f4, mueVar, y72Var, list2, i) { // from class: zdb
                public final /* synthetic */ dd4 b;
                public final /* synthetic */ List c;
                public final /* synthetic */ a26 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float g;
                public final /* synthetic */ long v;
                public final /* synthetic */ float w;
                public final /* synthetic */ mue x;
                public final /* synthetic */ y72 y;
                public final /* synthetic */ List z;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(807075841);
                    beb.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void e(final float f, float f2, long j, l46 l46Var, final int i, final int i2) {
        int i3;
        int i4;
        final float f3;
        final long j2;
        long j3;
        l46Var.h0(-686105722);
        if ((i & 6) == 0) {
            i3 = i | (l46Var.d(f) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (l46Var.d(f2) ? 32 : 16);
        }
        int i6 = i4 | (((i2 & 4) == 0 && l46Var.f(j)) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i6 & 1, (i6 & 147) != 146)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                f3 = i5 != 0 ? 1.0f : f2;
                if ((i2 & 4) != 0) {
                    j3 = ((e8b) l46Var.k(l8b.a)).A;
                }
                l46Var.s();
                s21.a(tm7.o(b.d(b.p(g09.a, f3), f / snd.b(null, l46Var, 1)), j3, g21.f), l46Var, 0);
                j2 = j3;
            } else {
                l46Var.Z();
                f3 = f2;
            }
            j3 = j;
            l46Var.s();
            s21.a(tm7.o(b.d(b.p(g09.a, f3), f / snd.b(null, l46Var, 1)), j3, g21.f), l46Var, 0);
            j2 = j3;
        } else {
            l46Var.Z();
            f3 = f2;
            j2 = j;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: aeb
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    beb.e(f, f3, j2, (l46) obj, k99.P(i | 1), i2);
                    return wef.a;
                }
            };
        }
    }

    public static final void f(TarotCardChoice tarotCardChoice, boolean z, boolean z2, l26 l26Var, l46 l46Var, int i) {
        int i2;
        boolean z3;
        l46Var.h0(-1784719939);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(tarotCardChoice) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z3 = z2;
            i2 |= l46Var.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            z3 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.i(l26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(null) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = new cxe();
                l46Var.p0(objR);
            }
            cxe cxeVar = (cxe) objR;
            j09 j09VarP = b.p(g09.a, 72.0f);
            Object objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR2;
            boolean zI = ((i2 & 7168) == 2048) | ((i2 & 14) == 4) | l46Var.i(cxeVar);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new n25(l26Var, tarotCardChoice, cxeVar, 27);
                l46Var.p0(objR3);
            }
            b21.d(androidx.compose.foundation.b.b(j09VarP, t69Var, null, z3, null, (x16) objR3, 24), tarotCardChoice, false, h(tarotCardChoice.getCard().getCardKey(), cxeVar, z, l46Var, ((i2 << 6) & 7168) | 6), null, 0.0f, null, null, l46Var, ((i2 << 3) & 112) | (i2 & 57344), 228);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t43(tarotCardChoice, z, z2, l26Var, i, 2);
        }
    }

    public static final void g(TarotCardChoice tarotCardChoice, float f, a26 a26Var, float f2, mue mueVar, y72 y72Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1596455098);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(tarotCardChoice) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(mueVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.g(y72Var) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = (i2 << 3) & 112;
            int i4 = i2 << 6;
            b21.d(b.p(g09.a, f), tarotCardChoice, false, null, a26Var, f2, mueVar, y72Var, l46Var, i3 | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 12);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xu7(tarotCardChoice, f, a26Var, f2, mueVar, y72Var, i);
        }
    }

    public static final j09 h(String str, cxe cxeVar, boolean z, l46 l46Var, int i) {
        g09 g09Var = g09.a;
        if (!z) {
            l46Var.f0(1380620398);
            l46Var.r(false);
            return g09Var;
        }
        l46Var.f0(1380489082);
        j09 j09VarA = vt1.a(g09Var, str, new yi4(8.0f), l46Var, i & 126, 6);
        boolean zI = l46Var.i(cxeVar);
        Object objR = l46Var.R();
        if (zI || objR == sf2.a) {
            objR = new p59(23, cxeVar);
            l46Var.p0(objR);
        }
        j09 j09VarW = nk8.w(j09VarA, (a26) objR);
        l46Var.r(false);
        return j09VarW;
    }
}
