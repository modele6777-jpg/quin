package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.annual.model.MonthlyContent;
import tech.chatmind.api.annual.model.MonthlySummary;
import tech.chatmind.api.personality.TarotCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s29 implements xj5 {
    public final /* synthetic */ xj5 a;

    public s29(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        r29 r29Var;
        Object m29Var;
        if (xn2Var instanceof r29) {
            r29Var = (r29) xn2Var;
            int i = r29Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                r29Var.label = i - Integer.MIN_VALUE;
            } else {
                r29Var = new r29(this, xn2Var);
            }
        } else {
            r29Var = new r29(this, xn2Var);
        }
        Object obj2 = r29Var.result;
        int i2 = r29Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            p19 p19Var = (p19) obj;
            m40 m40VarA0 = mh3.a0(p19Var.a);
            MonthlyContent monthlyContent = p19Var.c;
            if (monthlyContent != null) {
                List list = p19Var.b;
                ArrayList arrayList = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(r8c.p((TarotCard) it.next()));
                }
                String scoreTrendSummary = monthlyContent.getScoreTrendSummary();
                List<MonthlySummary> monthlyReports = monthlyContent.getMonthlyReports();
                ArrayList arrayList2 = new ArrayList(t72.u(monthlyReports, 10));
                Iterator<T> it2 = monthlyReports.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Float(((MonthlySummary) it2.next()).getScore()));
                }
                List listC1 = s72.c1(s72.b1(s72.q1(arrayList2), new kv8(2)), 3);
                ArrayList arrayList3 = new ArrayList(t72.u(listC1, 10));
                Iterator it3 = listC1.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new Integer(((n17) it3.next()).a));
                }
                m29Var = new o29(m40VarA0, arrayList, new t58(arrayList2, arrayList3), scoreTrendSummary);
            } else {
                m29Var = new m29(m40VarA0, null);
            }
            r29Var.L$0 = null;
            r29Var.L$1 = null;
            r29Var.L$2 = null;
            r29Var.L$3 = null;
            r29Var.label = 1;
            Object objA = this.a.a(m29Var, r29Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
