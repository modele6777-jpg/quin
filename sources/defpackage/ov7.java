package defpackage;

import ai.askquin.R;
import ai.askquin.datastore.model.LocalStorage;
import android.os.Build;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.LegacyImportRequest;
import tech.chatmind.api.LegacyImportResponse;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.dailycard.model.ListDailyCardResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ov7 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ ov7(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() throws Throwable {
        int i = this.a;
        uw9 uw9Var = uw9.b;
        switch (i) {
            case 0:
                return new LayoutNode(3);
            case 1:
                return LegacyImportRequest._childSerializers$_anonymous_();
            case 2:
                return LegacyImportResponse._childSerializers$_anonymous_();
            case 3:
                return LevelAndKind._childSerializers$_anonymous_();
            case 4:
                return LevelAndKind._childSerializers$_anonymous_$0();
            case 5:
                return ListDailyCardResponse._childSerializers$_anonymous_();
            case 6:
                return null;
            case 7:
                return vg0.a;
            case 8:
                return ch0.a;
            case 9:
                na8 na8Var = new na8(new mx(1, false));
                ig3.f(na8Var);
                z7f.u(na8Var, '-');
                ig3.g(na8Var);
                z7f.u(na8Var, '-');
                na8Var.c(new ru0(new zg3(uw9Var)));
                return new oa8(na8Var.build());
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                na8 na8Var2 = new na8(new mx(1, false));
                ig3.f(na8Var2);
                ig3.g(na8Var2);
                na8Var2.c(new ru0(new zg3(uw9Var)));
                return new oa8(na8Var2.build());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                wa8 wa8Var = new wa8(new mx(1, false));
                o1 o1Var = (o1) pa8.a.getValue();
                o1Var.getClass();
                wa8Var.c(((oa8) o1Var).a);
                z7f.o(wa8Var, new a26[]{new tb7(26)}, new tb7(27));
                md8 md8Var = (md8) od8.a.getValue();
                md8Var.getClass();
                wa8Var.b(md8Var.a);
                return new xa8(wa8Var.build());
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
                return null;
            case 15:
                pr4 pr4Var = gb8.a;
                return qk6.E0;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 17:
                return LocalStorage._childSerializers$_anonymous_();
            case 18:
                return LocalStorage._childSerializers$_anonymous_$0();
            case 19:
                return LocalStorage._childSerializers$_anonymous_$1();
            case 20:
                return LocalStorage._childSerializers$_anonymous_$2();
            case 21:
                return LocalStorage._childSerializers$_anonymous_$3();
            case 22:
                return LocalStorage._childSerializers$_anonymous_$4();
            case 23:
                return LocalStorage._childSerializers$_anonymous_$5();
            case 24:
                return LocalStorage._childSerializers$_anonymous_$6();
            case 25:
                ld8 ld8Var = new ld8(new mx(1, false));
                ld8Var.b(new ru0(new vq6(uw9Var)));
                z7f.u(ld8Var, ':');
                ld8Var.b(new ru0(new zv8(uw9Var)));
                z7f.o(ld8Var, new a26[]{new tb7(28)}, new tb7(29));
                return new md8(ld8Var.build());
            case 26:
                return q1c.f(Boolean.FALSE);
            case 27:
                String string = cn1.z().getString(R.string.help_mail_f_important);
                String string2 = cn1.z().getString(R.string.help_mail_f_appver);
                ca2.a.getClass();
                boolean z = ca2.c;
                String string3 = cn1.z().getString(R.string.help_mail_f_device);
                String str = Build.MANUFACTURER;
                String str2 = Build.MODEL;
                String str3 = Build.DEVICE;
                String string4 = cn1.z().getString(R.string.help_mail_f_sysver);
                int i2 = Build.VERSION.SDK_INT;
                hs3 hs3Var = xqa.A;
                Object objI = z5c.I(nu4.a, new df8(hs3Var.a, hs3Var.b, null));
                String string5 = cn1.z().getString(R.string.help_mail_f_important);
                StringBuilder sbO = ib8.o("\n", string, "\n  ", string2, " 5.23.0\n  isGp: ");
                sbO.append(z);
                sbO.append("\n  ");
                sbO.append(string3);
                sbO.append(" ");
                ub3.v(sbO, str, " | ", str2, " | ");
                sbO.append(str3);
                sbO.append("\n  ");
                sbO.append(string4);
                sbO.append(i2);
                sbO.append("\n  UID: ");
                sbO.append(objI);
                sbO.append("\n  DOMAIN: https://quin.love\n");
                sbO.append(string5);
                sbO.append("\n");
                return sbO.toString();
            case 28:
                return new LayoutNode(2);
            default:
                return wef.a;
        }
    }
}
