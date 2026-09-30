package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.annual.model.MonthlyContent;
import tech.chatmind.api.annual.model.MonthlySummary;
import tech.chatmind.api.personality.TarotCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d29 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ Application b;

    public d29(xj5 xj5Var, Application application) {
        this.a = xj5Var;
        this.b = application;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        c29 c29Var;
        Object x19Var;
        if (xn2Var instanceof c29) {
            c29Var = (c29) xn2Var;
            int i = c29Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29Var.label = i - Integer.MIN_VALUE;
            } else {
                c29Var = new c29(this, xn2Var);
            }
        } else {
            c29Var = new c29(this, xn2Var);
        }
        Object obj2 = c29Var.result;
        int i2 = c29Var.label;
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
                List<MonthlySummary> monthlyReports = monthlyContent.getMonthlyReports();
                mx4 mx4Var = g19.b;
                ArrayList arrayList2 = new ArrayList(t72.u(mx4Var, 10));
                int i3 = 0;
                l2 l2Var = new l2(0, mx4Var);
                while (l2Var.hasNext()) {
                    arrayList2.add(tm7.x((g19) l2Var.next(), this.b));
                }
                ArrayList arrayList3 = new ArrayList(t72.u(arrayList, 10));
                for (Object obj3 : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        t72.Z();
                        throw null;
                    }
                    arrayList3.add(new o8e(null, (qhe) obj3, (String) arrayList2.get(i3), monthlyReports.get(i3).getHighlight(), monthlyReports.get(i3).getContent()));
                    i3 = i4;
                }
                x19Var = new z19(m40VarA0, monthlyContent.getSummary(), arrayList3);
            } else {
                x19Var = new x19(m40VarA0, null);
            }
            c29Var.L$0 = null;
            c29Var.L$1 = null;
            c29Var.L$2 = null;
            c29Var.L$3 = null;
            c29Var.label = 1;
            Object objA = this.a.a(x19Var, c29Var);
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
