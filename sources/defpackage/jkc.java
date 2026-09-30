package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jkc extends rcf {
    public static final /* synthetic */ int Y = 0;
    public final List X;
    public final ckc y;
    public final mic z;

    public jkc(Application application, ckc ckcVar, mic micVar) {
        List<TarotCardChoice> virtualChoices;
        String str = "seasonal_" + micVar.a() + "_" + micVar.b();
        List list = rmc.a;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String string = application.getString(rmc.b((ArcanaGroup) it.next()));
            string.getClass();
            arrayList.add(new PatternData(string, string));
        }
        SeasonalDraftStore$Draft seasonalDraftStore$DraftB = ckcVar.b(micVar.b(), micVar.c().getWireValue());
        super(str, arrayList, (seasonalDraftStore$DraftB == null || (virtualChoices = seasonalDraftStore$DraftB.getVirtualChoices()) == null) ? pu4.a : virtualChoices, 8);
        this.y = ckcVar;
        this.z = micVar;
        this.v.setValue(tn4.b);
        this.X = rmc.a;
    }

    @Override // defpackage.rcf
    public final void l(TarotCardChoice tarotCardChoice, int i) {
        super.l(tarotCardChoice, i);
        ynb.V(hwf.a(this), null, null, new ikc(this, null), 3);
    }

    public final ArcanaGroup q() {
        int size = this.f.size();
        List list = this.X;
        return (ArcanaGroup) list.get(mh3.o(size, 0, t72.E(list)));
    }
}
