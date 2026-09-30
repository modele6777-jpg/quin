package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.draw.navhost.CameraPreviewRoute;
import ai.askquin.ui.draw.photo.homepage.PhysicalDeckCameraRoute;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$Detail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u14 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ka9 b;

    public /* synthetic */ u14(ka9 ka9Var, int i) {
        this.a = i;
        this.b = ka9Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ycc yccVarA;
        int i = this.a;
        wef wefVar = wef.a;
        ka9 ka9Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j74.a0(null, l46Var, 0);
                    j74.T(null, l46Var, 0);
                    j74.R(null, l46Var, 0);
                    j74.Q(null, l46Var, 0);
                    j74.Y(null, l46Var, 0);
                    j74.d(ka9Var, l46Var, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                j74.K(ka9Var, (l46) obj, k99.P(1));
                break;
            case 2:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    j74.a(ka9Var, l46Var2, 0);
                    j74.b(null, l46Var2, 0);
                    j74.v(null, l46Var2, 0);
                    j74.e(null, l46Var2, 0);
                    j74.c(ka9Var, null, l46Var2, 0);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((List) obj).getClass();
                ka9.e(ka9Var, CameraPreviewRoute.INSTANCE, null, 6);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((List) obj).getClass();
                ka9.e(ka9Var, CameraPreviewRoute.INSTANCE, null, 6);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ynb.k(ka9Var, (l46) obj, k99.P(1));
                break;
            case 6:
                List list = (List) obj;
                ((Integer) obj2).getClass();
                list.getClass();
                ka9.e(ka9Var, PhysicalDeckCameraRoute.INSTANCE, null, 6);
                da9 da9VarH = ka9Var.b.h();
                if (da9VarH != null && (yccVarA = da9VarH.a()) != null) {
                    ArrayList arrayList = new ArrayList(t72.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((TarotCardChoice) it.next()).getCard().name());
                    }
                    yccVarA.d("existing_cards", arrayList);
                    ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Boolean.valueOf(((TarotCardChoice) it2.next()).isReversed()));
                    }
                    yccVarA.d("existing_reversed", arrayList2);
                }
                break;
            default:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                String str = (String) obj2;
                tarotSkinIdentify.getClass();
                str.getClass();
                ka9.e(ka9Var, new ExploreTarotRoute$Detail(tarotSkinIdentify, str, 1, 0), null, 6);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ u14(ka9 ka9Var, int i, int i2) {
        this.a = i2;
        this.b = ka9Var;
    }
}
