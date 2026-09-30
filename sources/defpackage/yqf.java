package defpackage;

import android.os.StatFs;
import java.io.File;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import tech.chatmind.api.WhereDidYouHear;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yqf implements x16 {
    public final /* synthetic */ int a;

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                tl7 tl7Var = zd5.a;
                e1a e1aVarE = zd5.b.e("coil3_disk_cache");
                long jQ = 10485760;
                try {
                    File file = e1aVarE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jQ = mh3.q((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new gib(jQ, tl7Var, e1aVarE);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return wefVar;
            case 6:
                return Float.valueOf(0.25f);
            case 7:
                return WhereDidYouHear._init_$_anonymous_();
            case 8:
                return 2;
            case 9:
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new ndb(i2);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                gdg gdgVar = new gdg(new mx(1, false));
                ig3.f(gdgVar);
                z7f.u(gdgVar, '-');
                ig3.g(gdgVar);
                return new hdg(gdgVar.build());
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
        }
    }

    public /* synthetic */ yqf(int i) {
        this.a = i;
    }
}
