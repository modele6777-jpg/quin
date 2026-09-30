package org.ocpsoft.prettytime.i18n;

import defpackage.aye;
import defpackage.cr4;
import defpackage.qc0;
import defpackage.uxe;
import defpackage.vxe;
import defpackage.zq4;
import java.lang.reflect.Array;
import java.util.ListResourceBundle;
import org.ocpsoft.prettytime.units.Century;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.JustNow;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Millisecond;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Second;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class Resources_pl extends ListResourceBundle implements vxe {
    private static final Object[][] OBJECTS = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);
    private static final int polishPluralForms = 3;
    private static final int tolerance = 50;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class TimeFormatAided implements uxe {
        private final String[] plurals;

        public TimeFormatAided(String... strArr) {
            if (strArr.length == 3) {
                this.plurals = strArr;
            } else {
                qc0.j("Wrong plural forms number for Polish language!");
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0027  */
        private String performDecoration(boolean z, boolean z2, long j, String str) {
            char c;
            if (j == 1) {
                c = 0;
            } else {
                long j2 = j % 10;
                if (j2 < 2 || j2 > 4) {
                    c = 2;
                } else {
                    long j3 = j % 100;
                    if (j3 < 10 || j3 >= 20) {
                        c = 1;
                    } else {
                        c = 2;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            if (z2) {
                sb.append("za ");
            }
            sb.append(str);
            sb.append(' ');
            sb.append(this.plurals[c]);
            if (z) {
                sb.append(" temu");
            }
            return sb.toString();
        }

        @Override // defpackage.uxe
        public String decorate(zq4 zq4Var, String str) {
            cr4 cr4Var = (cr4) zq4Var;
            return performDecoration(cr4Var.c(), cr4Var.b(), cr4Var.a(Resources_pl.tolerance), str);
        }

        @Override // defpackage.uxe
        public String decorateUnrounded(zq4 zq4Var, String str) {
            cr4 cr4Var = (cr4) zq4Var;
            return performDecoration(cr4Var.c(), cr4Var.b(), Math.abs(cr4Var.a), str);
        }

        @Override // defpackage.uxe
        public String format(zq4 zq4Var) {
            return String.valueOf(((cr4) zq4Var).a(Resources_pl.tolerance));
        }

        @Override // defpackage.uxe
        public String formatUnrounded(zq4 zq4Var) {
            return String.valueOf(Math.abs(((cr4) zq4Var).a));
        }
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return OBJECTS;
    }

    @Override // defpackage.vxe
    public uxe getFormatFor(aye ayeVar) {
        if (ayeVar instanceof JustNow) {
            return new uxe() { // from class: org.ocpsoft.prettytime.i18n.Resources_pl.1
                private String performFormat(zq4 zq4Var) {
                    cr4 cr4Var = (cr4) zq4Var;
                    if (cr4Var.b()) {
                        return "za chwilę";
                    }
                    if (cr4Var.c()) {
                        return "przed chwilą";
                    }
                    return null;
                }

                @Override // defpackage.uxe
                public String format(zq4 zq4Var) {
                    return performFormat(zq4Var);
                }

                @Override // defpackage.uxe
                public String formatUnrounded(zq4 zq4Var) {
                    return performFormat(zq4Var);
                }

                @Override // defpackage.uxe
                public String decorate(zq4 zq4Var, String str) {
                    return str;
                }

                @Override // defpackage.uxe
                public String decorateUnrounded(zq4 zq4Var, String str) {
                    return str;
                }
            };
        }
        if (ayeVar instanceof Century) {
            return new TimeFormatAided("wiek", "wieki", "wieków");
        }
        if (ayeVar instanceof Day) {
            return new TimeFormatAided("dzień", "dni", "dni");
        }
        if (ayeVar instanceof Decade) {
            return new TimeFormatAided("dekadę", "dekady", "dekad");
        }
        if (ayeVar instanceof Hour) {
            return new TimeFormatAided("godzinę", "godziny", "godzin");
        }
        if (ayeVar instanceof Millennium) {
            return new TimeFormatAided("milenium", "milenia", "mileniów");
        }
        if (ayeVar instanceof Millisecond) {
            return new TimeFormatAided("milisekundę", "milisekundy", "milisekund");
        }
        if (ayeVar instanceof Minute) {
            return new TimeFormatAided("minutę", "minuty", "minut");
        }
        if (ayeVar instanceof Month) {
            return new TimeFormatAided("miesiąc", "miesiące", "miesięcy");
        }
        if (ayeVar instanceof Second) {
            return new TimeFormatAided("sekundę", "sekundy", "sekund");
        }
        if (ayeVar instanceof Week) {
            return new TimeFormatAided("tydzień", "tygodnie", "tygodni");
        }
        if (ayeVar instanceof Year) {
            return new TimeFormatAided("rok", "lata", "lat");
        }
        return null;
    }
}
