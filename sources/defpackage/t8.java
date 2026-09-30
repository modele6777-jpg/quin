package defpackage;

import ai.askquin.R;
import android.content.ClipData;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ t8(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.b;
        switch (i) {
            case 0:
                tce.a().setPrimaryClip(ClipData.newPlainText("invitation_code", str));
                jcc.k(0, Integer.valueOf(R.string.invitation_copy_code_success));
                return wefVar;
            case 1:
                return db6.A0(str);
            case 2:
                ConcurrentHashMap concurrentHashMap = xfb.a;
                xfb.g(str);
                return wefVar;
            case 3:
                ConcurrentHashMap concurrentHashMap2 = xfb.a;
                xfb.a(str);
                return wefVar;
            case 4:
                ConcurrentHashMap concurrentHashMap3 = xfb.a;
                xfb.i(str, "cut");
                return wefVar;
            case 5:
                ConcurrentHashMap concurrentHashMap4 = xfb.a;
                xfb.e(0, str, (6 & 2) != 0 ? null : "reading_done");
                return wefVar;
            case 6:
                return db6.A0(str);
            case 7:
                return db6.A0(str);
            case 8:
                return new sa9(str);
            case 9:
                return db6.A0(str);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return db6.A0(str);
            default:
                return db6.A0(str);
        }
    }
}
