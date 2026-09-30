package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d60 extends tf implements a26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d60(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        TarotCardType tarotCardType;
        ql6 ql6Var;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return ((w10) this.receiver).f();
            case 1:
                String str = (String) obj;
                str.getClass();
                r0 r0Var = (r0) this.receiver;
                r0Var.getClass();
                ConcurrentHashMap concurrentHashMap = xfb.a;
                xfb.i(r0Var.I0, str);
                return wefVar;
            case 2:
                vza vzaVar = (vza) obj;
                vzaVar.getClass();
                return ((o7f) this.receiver).d(vzaVar, true);
            case 3:
                ((p89) this.receiver).b((sgc) obj);
                return wefVar;
            case 4:
                jkc jkcVar = (jkc) this.receiver;
                List<TarotCardType> types = jkcVar.q().getTypes();
                while (true) {
                    lbb lbbVar = mbb.a;
                    tarotCardType = (TarotCardType) s72.S0(types);
                    jsd jsdVar = jkcVar.f;
                    if (jsdVar == null || !jsdVar.isEmpty()) {
                        ListIterator listIterator = jsdVar.listIterator();
                        do {
                            ql6Var = (ql6) listIterator;
                            if (ql6Var.hasNext()) {
                            }
                        } while (((TarotCardChoice) ql6Var.next()).getCard() != tarotCardType);
                    }
                }
                lbb lbbVar2 = mbb.a;
                return new TarotCardChoice(tarotCardType, mbb.b.h().nextBoolean(), (String) null, 4, (rp3) null);
            case 5:
                ((ape) this.receiver).r1(((lx6) obj).a);
                return wefVar;
            default:
                return ((rcf) this.receiver).f();
        }
    }
}
