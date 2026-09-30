package defpackage;

import com.adjust.sdk.Constants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x6d {
    public final xad a;
    public final String b;
    public final List c;
    public final e8d d;

    public x6d(xad xadVar, String str, List list) {
        this.a = xadVar;
        this.b = str;
        this.c = list;
        this.d = (e8d) s72.v0(list);
        if (v4e.Q(str)) {
            qc0.j("Share scene must not be blank");
            throw null;
        }
    }

    public final String a(e8d e8dVar) {
        e8dVar.getClass();
        xad xadVar = xad.GiftCard;
        xad xadVar2 = this.a;
        if (xadVar2 == xadVar) {
            return "gift_card";
        }
        if (e8dVar == e8d.Screenshot) {
            return "screenshot";
        }
        e8d e8dVar2 = e8d.Card;
        xad xadVar3 = xad.DailyCardScreenshot;
        xad xadVar4 = xad.DailyCard;
        if (e8dVar == e8dVar2) {
            return (xadVar2 == xadVar4 || xadVar2 == xadVar3) ? "daily_card" : "summary";
        }
        return (xadVar2 == xadVar4 || xadVar2 == xadVar3) ? "daily_card_long" : Constants.LONG;
    }
}
