package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class je3 implements xn7 {
    public static final je3 a = new je3();
    public static final hua b = eec.c("Date");

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        Date date = (Date) obj;
        date.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(date);
        str.getClass();
        ev4Var.D(str);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormat.parse(om3Var.u());
        date.getClass();
        return date;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
