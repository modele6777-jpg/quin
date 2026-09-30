package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.annual.model.DomainContent;
import tech.chatmind.api.annual.model.DomainSummary;
import tech.chatmind.api.personality.TarotCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uh4 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ Application b;
    public final /* synthetic */ boolean c;

    public uh4(xj5 xj5Var, Application application, boolean z) {
        this.a = xj5Var;
        this.b = application;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        sh4 sh4Var;
        Object ch4Var;
        if (xn2Var instanceof sh4) {
            sh4Var = (sh4) xn2Var;
            int i = sh4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sh4Var.label = i - Integer.MIN_VALUE;
            } else {
                sh4Var = new sh4(this, xn2Var);
            }
        } else {
            sh4Var = new sh4(this, xn2Var);
        }
        Object obj2 = sh4Var.result;
        int i2 = sh4Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            pg4 pg4Var = (pg4) obj;
            m40 m40VarA0 = mh3.a0(pg4Var.a);
            DomainContent domainContent = pg4Var.c;
            if (domainContent != null) {
                List list = pg4Var.b;
                ArrayList arrayList = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(r8c.p((TarotCard) it.next()));
                }
                List<DomainSummary> domainSummaries = domainContent.getDomainSummaries();
                ArrayList arrayList2 = new ArrayList(t72.u(domainSummaries, 10));
                int i3 = 0;
                for (Object obj3 : domainSummaries) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        t72.Z();
                        throw null;
                    }
                    DomainSummary domainSummary = (DomainSummary) obj3;
                    String domain = domainSummary.getDomain();
                    kg4.a.getClass();
                    kg4 kg4VarC = gec.C(domain);
                    arrayList2.add(new o8e(domainSummary.getTheme(), (qhe) arrayList.get(i3), kg4VarC != null ? tm7.w(kg4VarC, this.b, this.c) : domainSummary.getDomain(), domainSummary.getHighlight(), domainSummary.getContent()));
                    i3 = i4;
                }
                ch4Var = new eh4(m40VarA0, arrayList2);
            } else {
                ch4Var = new ch4(m40VarA0, null);
            }
            sh4Var.L$0 = null;
            sh4Var.L$1 = null;
            sh4Var.L$2 = null;
            sh4Var.L$3 = null;
            sh4Var.label = 1;
            Object objA = this.a.a(ch4Var, sh4Var);
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
