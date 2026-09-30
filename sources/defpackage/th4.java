package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.annual.model.DomainContent;
import tech.chatmind.api.annual.model.DomainSummary;
import tech.chatmind.api.annual.model.UserPostContent;
import tech.chatmind.api.personality.TarotCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class th4 implements xj5 {
    public final /* synthetic */ xj5 a;

    public th4(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        rh4 rh4Var;
        Object lh4Var;
        if (xn2Var instanceof rh4) {
            rh4Var = (rh4) xn2Var;
            int i = rh4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rh4Var.label = i - Integer.MIN_VALUE;
            } else {
                rh4Var = new rh4(this, xn2Var);
            }
        } else {
            rh4Var = new rh4(this, xn2Var);
        }
        Object obj2 = rh4Var.result;
        int i2 = rh4Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            pg4 pg4Var = (pg4) obj;
            m40 m40VarA0 = mh3.a0(pg4Var.a);
            List listI = t72.I("middle_high_school", "college_above");
            UserPostContent userPostContent = pg4Var.d;
            boolean zO0 = s72.o0(listI, userPostContent != null ? userPostContent.getCareerStatus() : null);
            DomainContent domainContent = pg4Var.c;
            if (domainContent != null) {
                List list = pg4Var.b;
                ArrayList arrayList = new ArrayList(t72.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(r8c.p((TarotCard) it.next()));
                }
                String domainSummary = domainContent.getDomainSummary();
                List<DomainSummary> domainSummaries = domainContent.getDomainSummaries();
                ArrayList arrayList2 = new ArrayList();
                for (DomainSummary domainSummary2 : domainSummaries) {
                    String domain = domainSummary2.getDomain();
                    kg4.a.getClass();
                    kg4 kg4VarC = gec.C(domain);
                    di4 di4Var = kg4VarC != null ? new di4(kg4VarC, domainSummary2.getScore() / 100.0f) : null;
                    if (di4Var != null) {
                        arrayList2.add(di4Var);
                    }
                }
                lh4Var = new nh4(m40VarA0, arrayList, arrayList2, domainSummary, zO0);
            } else {
                lh4Var = new lh4(null, 3);
            }
            rh4Var.L$0 = null;
            rh4Var.L$1 = null;
            rh4Var.L$2 = null;
            rh4Var.L$3 = null;
            rh4Var.label = 1;
            Object objA = this.a.a(lh4Var, rh4Var);
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
