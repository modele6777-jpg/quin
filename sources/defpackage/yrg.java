package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yrg extends g5h {
    public long d;
    public String e;

    @Override // defpackage.g5h
    public final boolean B0() {
        Calendar calendar = Calendar.getInstance();
        this.d = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.e = ib8.m(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long E0() {
        C0();
        return this.d;
    }

    public final String F0() {
        C0();
        return this.e;
    }
}
