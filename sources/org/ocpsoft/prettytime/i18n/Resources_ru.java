package org.ocpsoft.prettytime.i18n;

import defpackage.aye;
import defpackage.cr4;
import defpackage.tec;
import defpackage.ub3;
import defpackage.uxe;
import defpackage.vxe;
import defpackage.zq4;
import java.lang.reflect.Array;
import java.util.Arrays;
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
public class Resources_ru extends ListResourceBundle implements vxe {
    private static final Object[][] OBJECTS = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);
    private static final int russianPluralForms = 4;
    private static final int tolerance = 50;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public class TimeFormatAided implements uxe {
        private final String[] pluarls;

        public TimeFormatAided(String... strArr) {
            if (strArr.length == 4) {
                this.pluarls = strArr;
                return;
            }
            throw new IllegalArgumentException("Wrong plural forms number for russian language! Expected 4, got " + strArr.length + "\nPlurals: " + Arrays.toString(strArr));
        }

        @Override // defpackage.uxe
        public String decorate(zq4 zq4Var, String str) {
            if (!requiresReformatting(zq4Var, true)) {
                return performDecoration(zq4Var, str);
            }
            cr4 cr4Var = (cr4) zq4Var;
            return performDecoration(cr4Var, performFormat(Math.abs(cr4Var.a(Resources_ru.tolerance)), false));
        }

        @Override // defpackage.uxe
        public String decorateUnrounded(zq4 zq4Var, String str) {
            return requiresReformatting(zq4Var, false) ? performDecoration(zq4Var, performFormat(Math.abs(((cr4) zq4Var).a), false)) : performDecoration(zq4Var, str);
        }

        @Override // defpackage.uxe
        public String format(zq4 zq4Var) {
            return performFormat(Math.abs(((cr4) zq4Var).a(Resources_ru.tolerance)), true);
        }

        @Override // defpackage.uxe
        public String formatUnrounded(zq4 zq4Var) {
            return performFormat(Math.abs(((cr4) zq4Var).a), true);
        }

        public String performDecoration(zq4 zq4Var, String str) {
            cr4 cr4Var = (cr4) zq4Var;
            if (cr4Var.b()) {
                return ub3.i("через ", str);
            }
            return cr4Var.c() ? tec.l(str, " назад") : str;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0030  */
        public String performFormat(long j, boolean z) {
            int i;
            long j2 = j % 10;
            if (j2 == 1 && j % 100 != 11) {
                i = 0;
            } else if (j2 < 2 || j2 > 4) {
                i = 2;
            } else {
                long j3 = j % 100;
                if (j3 < 10 || j3 >= 20) {
                    i = 1;
                } else {
                    i = 2;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(j));
            sb.append(' ');
            String[] strArr = this.pluarls;
            if (!z || i != 0) {
                i++;
            }
            sb.append(strArr[i]);
            return sb.toString();
        }

        public boolean requiresReformatting(zq4 zq4Var, boolean z) {
            return Math.abs(z ? ((cr4) zq4Var).a(Resources_ru.tolerance) : ((cr4) zq4Var).a) == 1;
        }
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return OBJECTS;
    }

    @Override // defpackage.vxe
    public uxe getFormatFor(aye ayeVar) {
        if (ayeVar instanceof JustNow) {
            return new uxe() { // from class: org.ocpsoft.prettytime.i18n.Resources_ru.1
                private String performFormat(zq4 zq4Var) {
                    cr4 cr4Var = (cr4) zq4Var;
                    if (cr4Var.b()) {
                        return "сейчас";
                    }
                    if (cr4Var.c()) {
                        return "только что";
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
            return new TimeFormatAided("век", "век", "века", "веков");
        }
        if (ayeVar instanceof Day) {
            return new TimeFormatAided("день", "день", "дня", "дней");
        }
        if (ayeVar instanceof Decade) {
            return new TimeFormatAided("десятилетие", "десятилетие", "десятилетия", "десятилетий");
        }
        if (ayeVar instanceof Hour) {
            return new TimeFormatAided("час", "час", "часа", "часов");
        }
        if (ayeVar instanceof Millennium) {
            return new TimeFormatAided("тысячелетие", "тысячелетие", "тысячелетия", "тысячелетий");
        }
        if (ayeVar instanceof Millisecond) {
            return new TimeFormatAided("миллисекунда", "миллисекунду", "миллисекунды", "миллисекунд");
        }
        if (ayeVar instanceof Minute) {
            return new TimeFormatAided("минута", "минуту", "минуты", "минут");
        }
        if (ayeVar instanceof Month) {
            return new TimeFormatAided("месяц", "месяц", "месяца", "месяцев");
        }
        if (ayeVar instanceof Second) {
            return new TimeFormatAided("секунда", "секунду", "секунды", "секунд");
        }
        if (ayeVar instanceof Week) {
            return new TimeFormatAided("неделя", "неделю", "недели", "недель");
        }
        if (ayeVar instanceof Year) {
            return new TimeFormatAided("год", "год", "года", "лет");
        }
        return null;
    }
}
