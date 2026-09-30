package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.personality.CosmicSection;
import tech.chatmind.api.personality.CpSection;
import tech.chatmind.api.personality.ExtendedTraitItem;
import tech.chatmind.api.personality.Overview;
import tech.chatmind.api.personality.PersonalitySection;
import tech.chatmind.api.personality.ProfessionSection;
import tech.chatmind.api.personality.RomanceSection;
import tech.chatmind.api.personality.ShortCard;
import tech.chatmind.api.personality.TarotCard;
import tech.chatmind.api.personality.TraitItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vsb implements xj5 {
    public final /* synthetic */ xj5 a;

    public vsb(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        usb usbVar;
        dsb dsbVar;
        if (xn2Var instanceof usb) {
            usbVar = (usb) xn2Var;
            int i = usbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                usbVar.label = i - Integer.MIN_VALUE;
            } else {
                usbVar = new usb(this, xn2Var);
            }
        } else {
            usbVar = new usb(this, xn2Var);
        }
        Object obj2 = usbVar.result;
        int i2 = usbVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            v16 v16Var = (v16) obj;
            Overview overview = v16Var.a;
            CosmicSection cosmicSection = v16Var.g;
            ProfessionSection professionSection = v16Var.f;
            RomanceSection romanceSection = v16Var.d;
            PersonalitySection personalitySection = v16Var.c;
            CpSection cpSection = v16Var.e;
            TarotCard tarotCard = overview.getTarotCard();
            fie fieVar = TarotCardType.Companion;
            String name = tarotCard.getName();
            fieVar.getClass();
            TarotCardType tarotCardTypeA = fie.a(name);
            if (tarotCardTypeA == null) {
                dsbVar = null;
            } else {
                TarotCardChoice tarotCardChoice = new TarotCardChoice(tarotCardTypeA, tarotCard.getDirection() == 0, (String) null, 4, (rp3) null);
                String tarotCardDesc = v16Var.a.getTarotCardDesc();
                String title = personalitySection.getTitle();
                List<TraitItem> list = personalitySection.getList();
                ArrayList arrayList = new ArrayList(t72.u(list, 10));
                for (TraitItem traitItem : list) {
                    arrayList.add(new rsc(traitItem.getSubTitle(), traitItem.getDesc()));
                }
                qsc qscVar = new qsc(title, arrayList);
                String title2 = romanceSection.getTitle();
                List<TraitItem> list2 = romanceSection.getList();
                ArrayList arrayList2 = new ArrayList(t72.u(list2, 10));
                for (TraitItem traitItem2 : list2) {
                    arrayList2.add(new rsc(traitItem2.getSubTitle(), traitItem2.getDesc()));
                }
                qsc qscVar2 = new qsc(title2, arrayList2);
                String leadingTitle = cpSection.getLeadingTitle();
                String highlightTitle = cpSection.getHighlightTitle();
                String trailingTitle = cpSection.getTrailingTitle();
                fie fieVar2 = TarotCardType.Companion;
                String name2 = ((TarotCard) s72.v0(cpSection.getTarotCards())).getName();
                fieVar2.getClass();
                TarotCardType tarotCardTypeA2 = fie.a(name2);
                if (tarotCardTypeA2 != null) {
                    TarotCardChoice tarotCardChoice2 = new TarotCardChoice(tarotCardTypeA2, ((TarotCard) s72.v0(cpSection.getTarotCards())).getDirection() == 0, (String) null, 4, (rp3) null);
                    TarotCardType tarotCardTypeA3 = fie.a(((TarotCard) s72.F0(cpSection.getTarotCards())).getName());
                    if (tarotCardTypeA3 == null) {
                        dsbVar = null;
                    } else {
                        zw2 zw2Var = new zw2(leadingTitle, highlightTitle, trailingTitle, new iy9(tarotCardChoice2, new TarotCardChoice(tarotCardTypeA3, ((TarotCard) s72.F0(cpSection.getTarotCards())).getDirection() == 0, (String) null, 4, (rp3) null)), cpSection.getDesc());
                        String title3 = professionSection.getTitle();
                        List<TraitItem> list3 = professionSection.getList();
                        ArrayList arrayList3 = new ArrayList(t72.u(list3, 10));
                        for (TraitItem traitItem3 : list3) {
                            arrayList3.add(new rsc(traitItem3.getSubTitle(), traitItem3.getDesc()));
                        }
                        qsc qscVar3 = new qsc(title3, arrayList3);
                        ShortCard shortCard = v16Var.b;
                        String title4 = cosmicSection.getTitle();
                        List<ExtendedTraitItem> list4 = cosmicSection.getList();
                        ArrayList arrayList4 = new ArrayList(t72.u(list4, 10));
                        for (ExtendedTraitItem extendedTraitItem : list4) {
                            arrayList4.add(new y92(extendedTraitItem.getLeadingTitle(), extendedTraitItem.getHighlightTitle(), extendedTraitItem.getTrailingTitle(), extendedTraitItem.getDesc(), extendedTraitItem.getHeroDesc()));
                        }
                        dsbVar = new dsb(tarotCardChoice, shortCard, tarotCardDesc, qscVar, qscVar2, zw2Var, qscVar3, new x92(title4, arrayList4));
                    }
                } else {
                    dsbVar = null;
                }
            }
            usbVar.L$0 = null;
            usbVar.L$1 = null;
            usbVar.L$2 = null;
            usbVar.L$3 = null;
            usbVar.label = 1;
            Object objA = this.a.a(dsbVar, usbVar);
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
