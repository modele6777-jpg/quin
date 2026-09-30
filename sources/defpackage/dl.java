package defpackage;

import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.OverviewItem;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dl implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ dl(r0 r0Var, int i) {
        this.a = i;
        this.b = r0Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        String str = "general";
        wef wefVar = wef.a;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                hf8.Q.getClass();
                ef8.a("SpreadDeskListScreen").e("onAiSpreadClick: " + iIntValue);
                r0Var.t1(iIntValue);
                r0Var.J1(null);
                return wefVar;
            case 1:
                ((ra4) obj).getClass();
                Object obj2 = new Object();
                AtomicReference atomicReference = k3b.a;
                k3b.a.set(new j3b(obj2, new w(1, this.b, r0.class, "applyFollowUpFixtureForQa", "applyFollowUpFixtureForQa$Quin_conversation_gpRelease(Ljava/lang/String;)Z", 0, 22)));
                return new jt2(0, obj2);
            case 2:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a("auto_end", "btn");
                if (r0Var.V() != null) {
                    str = "scene";
                } else if (r0Var.y1 != null) {
                    str = "photo_reading";
                }
                l1fVar.a(str, "pathway");
                l1fVar.a(100, "completion_rate");
                return wefVar;
            case 3:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                fc4 fc4Var = r0Var.H0;
                if (fc4Var == null) {
                    pa7.g0("divinationKey");
                    throw null;
                }
                l1fVar2.a(fc4Var.a, "conversation_id");
                l1fVar2.a(r0Var.V() != null ? "scene" : "general", "pathway");
                String str2 = (String) r0Var.t().d();
                if (str2 == null) {
                    str2 = "main";
                }
                l1fVar2.a(str2, "divination_type");
                return wefVar;
            case 4:
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                fc4 fc4Var2 = r0Var.H0;
                if (fc4Var2 != null) {
                    l1fVar3.a(fc4Var2.a, "chatid");
                    return wefVar;
                }
                pa7.g0("divinationKey");
                throw null;
            case 5:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.a("submit_feedback", "btn");
                fc4 fc4Var3 = r0Var.H0;
                if (fc4Var3 != null) {
                    l1fVar4.a(fc4Var3.a, "chat_id");
                    return wefVar;
                }
                pa7.g0("divinationKey");
                throw null;
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                x1f x1fVar = x1f.a;
                x1f.g(p05.a, m1f.a, new ia(str3, 27));
                r0Var.getClass();
                r0Var.e1.setValue(str3);
                r0Var.f1 = str3;
                return wefVar;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                r0Var.R1.setValue(bool);
                return wefVar;
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                return r0Var.n(str4);
            case 9:
                String str5 = (String) obj;
                str5.getClass();
                r0Var.getClass();
                j6a j6aVar = (j6a) r0Var.V0.get(str5);
                if (j6aVar != null) {
                    return j6aVar.a;
                }
                return null;
            default:
                OverviewItem.ClarifyingCardItem clarifyingCardItem = (OverviewItem.ClarifyingCardItem) obj;
                clarifyingCardItem.getClass();
                r0Var.n1(clarifyingCardItem.getMessageId());
                return wefVar;
        }
    }
}
