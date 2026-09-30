package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q12 extends tf implements l26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q12(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        TarotCardType tarotCardType;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                r12 r12Var = (r12) this.receiver;
                ArrayList arrayList = r12Var.f;
                if (arrayList != null) {
                    Object objY0 = s72.y0(iIntValue, arrayList);
                    if (objY0 == null) {
                        qc0.j("Invalid mixed deck position");
                        return null;
                    }
                    tarotCardType = (TarotCardType) objY0;
                    if (r12Var.e.contains(tarotCardType)) {
                        qc0.j("Card already drawn");
                        return null;
                    }
                } else {
                    lx4 entries = TarotCardType.getEntries();
                    LinkedHashSet linkedHashSet = r12Var.e;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : entries) {
                        if (!linkedHashSet.contains((TarotCardType) obj3)) {
                            arrayList2.add(obj3);
                        }
                    }
                    lbb lbbVar = mbb.a;
                    tarotCardType = (TarotCardType) s72.S0(arrayList2);
                }
                TarotCardType tarotCardType2 = tarotCardType;
                lbb lbbVar2 = mbb.a;
                return new TarotCardChoice(tarotCardType2, mbb.b.h().nextBoolean(), (String) null, 4, (rp3) null);
            case 1:
                int iIntValue2 = ((Number) obj2).intValue();
                ((dd2) this.receiver).a(iIntValue2, (l46) obj);
                return wefVar;
            case 2:
                long j = ((zsf) obj).a;
                yhc yhcVar = (yhc) this.receiver;
                ynb.V(yhcVar.Y0.c(), null, null, new whc(yhcVar, j, null), 3);
                return wefVar;
            default:
                long j2 = ((zsf) obj).a;
                yhc yhcVar2 = (yhc) this.receiver;
                ynb.V(yhcVar2.Y0.c(), null, null, new xhc(yhcVar2, j2, null), 3);
                return wefVar;
        }
    }
}
