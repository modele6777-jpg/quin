package defpackage;

import tech.chatmind.api.annual.model.AnnualLuckResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c50 implements hf8 {
    public static final /* synthetic */ int b = 0;
    public final n10 a;

    public c50(n10 n10Var) {
        this.a = n10Var;
    }

    public static v50 a(ServerResponse serverResponse) {
        if (!serverResponse.getSuccess()) {
            return v50.a;
        }
        if (((AnnualLuckResponse) serverResponse.getData()).getUser() == null || ((AnnualLuckResponse) serverResponse.getData()).getUser().getCareerStatus().length() == 0 || ((AnnualLuckResponse) serverResponse.getData()).getUser().getGender().length() == 0 || ((AnnualLuckResponse) serverResponse.getData()).getUser().getLoveStatus().length() == 0 || ((AnnualLuckResponse) serverResponse.getData()).getUser().getNickname().length() == 0 || ((AnnualLuckResponse) serverResponse.getData()).getMonthlyCards() == null || ((AnnualLuckResponse) serverResponse.getData()).getMonthlyCards().size() < 12) {
            return v50.b;
        }
        if (((AnnualLuckResponse) serverResponse.getData()).getMonthlyContent() == null) {
            return v50.c;
        }
        if (((AnnualLuckResponse) serverResponse.getData()).getDomainsCards() == null || ((AnnualLuckResponse) serverResponse.getData()).getDomainsCards().size() < 6) {
            return v50.d;
        }
        return ((AnnualLuckResponse) serverResponse.getData()).getDomainContent() == null ? v50.e : v50.f;
    }
}
