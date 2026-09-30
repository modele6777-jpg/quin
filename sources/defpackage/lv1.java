package defpackage;

import ai.askquin.ui.draw.model.CardBoxState;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lv1 implements x16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ lv1(List list, int i, List list2) {
        this.b = list;
        this.d = i;
        this.c = list2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        String name;
        int i = this.a;
        int i2 = this.d;
        List list = this.c;
        List list2 = this.b;
        switch (i) {
            case 0:
                int iE = t72.E(list2);
                int i3 = iE + 1;
                c78 c78VarW = t72.w();
                int i4 = 0;
                while (i4 < i2) {
                    boolean z = i4 == i3;
                    boolean z2 = i4 == iE;
                    TarotCardChoice tarotCardChoice = (TarotCardChoice) s72.y0(i4, list2);
                    PatternData patternData = (PatternData) s72.y0(i4, list);
                    String str = null;
                    if (patternData != null && (name = patternData.getName()) != null && !v4e.Q(name)) {
                        str = name;
                    }
                    c78VarW.add(new CardBoxState(tarotCardChoice, z2, z, str));
                    i4++;
                }
                return c78VarW.n();
            default:
                return db6.A0(list2, list, Integer.valueOf(i2));
        }
    }

    public /* synthetic */ lv1(List list, List list2, int i) {
        this.b = list;
        this.c = list2;
        this.d = i;
    }
}
