package defpackage;

import android.util.Rational;
import androidx.compose.ui.node.LayoutNode;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import tech.chatmind.api.LimitedQuota;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y85 implements Comparator {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ y85(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String name;
        String name2;
        w57 w57VarY;
        w57 w57VarY2;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ckb ckbVar = (ckb) obj3;
                return ((Comparable) ckbVar.d(obj)).compareTo((Comparable) ckbVar.d(obj2));
            case 1:
                String str = (String) obj3;
                um7 um7VarB = ((yn7) obj).B();
                if (um7VarB == null) {
                    cva.v(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (!(um7VarB instanceof em7)) {
                    if (um7VarB instanceof ao7) {
                        name = ((ao7) um7VarB).c;
                    } else {
                        cls = um7VarB.getClass();
                    }
                    cva.k(job.a.b(cls), "Unknown upper bound classifier: ");
                    return 0;
                }
                name = af1.R((em7) um7VarB).getName();
                um7 um7VarB2 = ((yn7) obj2).B();
                if (um7VarB2 == null) {
                    cva.v(str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (um7VarB2 instanceof em7) {
                    name2 = af1.R((em7) um7VarB2).getName();
                } else {
                    if (!(um7VarB2 instanceof ao7)) {
                        cls = um7VarB2.getClass();
                        cva.k(job.a.b(cls), "Unknown upper bound classifier: ");
                        return 0;
                    }
                    name2 = ((ao7) um7VarB2).c;
                }
                return i7h.m(name, name2);
            case 2:
                qu quVar = (qu) obj3;
                String expiredAt = ((LimitedQuota) ((iy9) obj).a()).getExpiredAt();
                Instant instant = expiredAt != null ? Instant.parse(expiredAt) : null;
                String expiredAt2 = ((LimitedQuota) ((iy9) obj2).a()).getExpiredAt();
                return quVar.compare(instant, expiredAt2 != null ? Instant.parse(expiredAt2) : null);
            case 3:
                lc4 lc4Var = (lc4) obj2;
                ((qk6) obj3).getClass();
                lc4Var.getClass();
                Instant instant2 = lc4Var.d;
                if (instant2 == null || (w57VarY = vpf.Y(instant2)) == null) {
                    w57VarY = vpf.Y(lc4Var.b);
                }
                lc4 lc4Var2 = (lc4) obj;
                lc4Var2.getClass();
                Instant instant3 = lc4Var2.d;
                if (instant3 == null || (w57VarY2 = vpf.Y(instant3)) == null) {
                    w57VarY2 = vpf.Y(lc4Var2.b);
                }
                return i7h.m(w57VarY, w57VarY2);
            case 4:
                tt7 tt7Var = (tt7) obj;
                a26 a26Var = (a26) obj3;
                tt7Var.getClass();
                String string = a26Var.d(tt7Var).toString();
                tt7 tt7Var2 = (tt7) obj2;
                tt7Var2.getClass();
                return i7h.m(string, a26Var.d(tt7Var2).toString());
            case 5:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
            case 6:
                w69 w69Var = (w69) obj3;
                return Integer.valueOf(w69Var.c(((Number) obj).longValue())).compareTo(Integer.valueOf(w69Var.c(((Number) obj2).longValue())));
            case 7:
                int iCompare = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                LayoutNode layoutNode = ((ywc) obj).c;
                LayoutNode layoutNode2 = ((ywc) obj2).c;
                return layoutNode.J() == layoutNode2.J() ? pa7.L(layoutNode.G(), layoutNode2.G()) : Float.compare(layoutNode.J(), layoutNode2.J());
            case 8:
                int iCompare2 = ((y85) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((ywc) obj).f).compareTo(Integer.valueOf(((ywc) obj2).f));
            default:
                ArrayList arrayList = ((d3e) obj3).g;
                Iterator it = ((b3e) obj).l.iterator();
                if (it.hasNext()) {
                    Integer numValueOf = Integer.valueOf(arrayList.indexOf((xj1) it.next()));
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(arrayList.indexOf((xj1) it.next()));
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((b3e) obj2).l.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(arrayList.indexOf((xj1) it2.next()));
                        while (it2.hasNext()) {
                            Integer numValueOf4 = Integer.valueOf(arrayList.indexOf((xj1) it2.next()));
                            if (numValueOf3.compareTo(numValueOf4) > 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return numValueOf.compareTo(numValueOf3);
                    }
                }
                s8f.c();
                return 0;
        }
    }
}
