package defpackage;

import ai.askquin.ui.dailycard.DailyCardEntry;
import ai.askquin.ui.dailycard.o;
import java.time.LocalDate;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q93 extends gbe implements l26 {
    final /* synthetic */ String $activeDeckId;
    final /* synthetic */ e3b $clock;
    final /* synthetic */ DailyCardEntry $route;
    final /* synthetic */ String $segmentId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q93(String str, String str2, DailyCardEntry dailyCardEntry, e3b e3bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$segmentId = str;
        this.$activeDeckId = str2;
        this.$route = dailyCardEntry;
        this.$clock = e3bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q93(this.$segmentId, this.$activeDeckId, this.$route, this.$clock, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str = this.$segmentId;
        String str2 = this.$activeDeckId;
        String source = this.$route.getSource();
        String targetDate = this.$route.getTargetDate();
        LocalDate localDate = e3b.a(this.$clock).toLocalDate();
        localDate.getClass();
        String strB = o.b(targetDate, localDate);
        str.getClass();
        str2.getClass();
        source.getClass();
        ConcurrentHashMap concurrentHashMap = xfb.a;
        Set set = a63.a;
        String str3 = "homepage";
        if (!source.equals("homepage")) {
            str3 = "calendar";
            if (!source.equals("calendar")) {
                a63.a.contains(source);
                str3 = "fortune_detail";
            }
        }
        if (!xfb.b.contains(str)) {
            xfb.a.putIfAbsent(str, new vfb(str3, "shuffle", "daily_fortune", strB));
        }
        xfb.i(str, "shuffle");
        xfb.b(str, str2);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        q93 q93Var = (q93) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        q93Var.r(wefVar);
        return wefVar;
    }
}
