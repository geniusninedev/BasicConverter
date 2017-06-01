package com.nineinfosys.basicconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.nineinfosys.basicconverter.ConverterActivity.AngleActivity;
import com.nineinfosys.basicconverter.ConverterActivity.AreaActivity;
import com.nineinfosys.basicconverter.ConverterActivity.CookingActivity;
import com.nineinfosys.basicconverter.ConverterActivity.DataStorageActivity;
import com.nineinfosys.basicconverter.ConverterActivity.DataTransferConverterActivity;
import com.nineinfosys.basicconverter.ConverterActivity.EnergyActivity;
import com.nineinfosys.basicconverter.ConverterActivity.ForceActivity;
import com.nineinfosys.basicconverter.ConverterActivity.FuelActivity;
import com.nineinfosys.basicconverter.ConverterActivity.ImageActivity;
import com.nineinfosys.basicconverter.ConverterActivity.LengthActivity;
import com.nineinfosys.basicconverter.ConverterActivity.PowerActivity;
import com.nineinfosys.basicconverter.ConverterActivity.PrefixActivity;
import com.nineinfosys.basicconverter.ConverterActivity.PressureActivity;
import com.nineinfosys.basicconverter.ConverterActivity.SoundActivity;
import com.nineinfosys.basicconverter.ConverterActivity.SpeedActivity;
import com.nineinfosys.basicconverter.ConverterActivity.TempertureActivity;
import com.nineinfosys.basicconverter.ConverterActivity.TimeActivity;
import com.nineinfosys.basicconverter.ConverterActivity.TypographyConversionActivity;
import com.nineinfosys.basicconverter.ConverterActivity.VolumeActivity;
import com.nineinfosys.basicconverter.ConverterActivity.VolumeDryActivity;
import com.nineinfosys.basicconverter.ConverterActivity.VolumeLumberConverterActivity;
import com.nineinfosys.basicconverter.ConverterActivity.WeightActivity;
import com.nineinfosys.basicconverter.ConverterActivity.WorkConverterActivity;


public class SearchActivity extends AppCompatActivity implements TextWatcher {


    // List view
    private ListView lv;

    private String selectedItem;
    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //customize toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Search Unit");


        // Listview Data
        String listitem[] = {
                "Meter -m", "Kilometer -km", "Decimeter -dm",
                "Centimeter -cm", "Millimeter -mm", "Micrometer -μm",
                "Nanometer -nm", "Mile -mi,mi(Int)", "Yard -yd",
                "Foot -ft", "Inch -in", "Light year -ly",
                "Exameter -Em", "Petameter -Pm", "Terameter -Tm",
                "Gigameter -Gm", "Megameter -Mm", "Hectometer -hm",
                "Dekameter -dam", "Micron -μ", "Picometer -pm",
                "Femtometer -fm", "Attometer -am", "Megaparsec -Mpc",
                "Kiloparsec -kpc", "Parsec -pc", "Astronomical unit -AU,UA",
                "League -lea", "Nautical league (UK) -n.lea(UK)", "Nautical league (int.) -n.lea",
                "League (statute) -lea(US)", "Nautical mile (UK) -n.mi", "Nautical mile (international) -n.mi",
                "Mile (statute) -mi,mi(US)", "Mile (US survey) -mi,mi(US)", "Mile (Roman)-mile",
                "Kiloyard -kyd", "Furlong -fur", "Furlong (US survey) -fur",
                "Chain -ch", "Chain (US survey) -ch", "Rope -rope",
                "Rod -rd", "Rod (US survey) -rd", "Perch -perch",
                "Pole -pole", "Fathom -fath", "Fathom (US survey) -fath",
                "Ell -ell", "Foot (US survey) -ft", "Link -li",
                "Link (US survey) -li", "Cubit (UK) -cubit", "Hand -hand",
                "Span (cloth) -span", "Finger (cloth) -finger", "Nail (cloth) -nail",
                "Inch (US survey) -in", "Barleycorn -barleycorn", "Mil -mil,thou",
                "Microinch -μ.in", "Angstrom -A", "A.u. of length -a.u.,b", "X-unit -X",
                "Fermi -F,f", "Arpent -Arpent", "Pica -pica", "Point -Point", "Twip  -twip",
                "Aln -aln", "Famn -famn", "Caliber -cl", "Centiinch -cin", "Ken -ken",
                "Russian archin -archin", "Roman actus -actus", "Vara de tarea -v.de.t",
                "Vara conuquera -vc", "Vara castellana -vcas", "Cubit (Greek) -cubit",
                "Long reed -lreed", "Reed -reed", "Long cubit -long cubit",
                "Handbreadth -hb", "Fingerbreadth -fb", "Planck length -Planck",
                "Electron radius (classical) -e-rad", "Bohr radius -b,a.u.:",
                "Earth's equatorial radius -Earth", "Earth's polar radius -Earth", "Earth's distance from sun -Earth",
                "Sun's radius -Sun",

                //weight
                "Kilogram -  kg", "Gram - g", "Milligram - mg",
                "Ton - t", "Pound - lbs", "Ounce - oz", "Carat - ct",
                "Ton short US - ton", "Ton long UK - ton", "Atomic mass unit - u",

                "Exagram -  Eg", "Petagram - Pg", "Teragram - Tg",
                "Gigagram -  Gg", "Megagram - Mg", "Hectogram - hg",
                "Dekagram -  dag", "Decigram - dg", "Centigram - cg",
                "Microgram - μg", "Nanogram  - ng", "Picogram -  pg",
                "Femtogram - fg", "Attogram - ag", "Dalton - dt",
                "Kilogram-energy square second/meter - kg F sq s m- 1", "Kilopound - kip", "Kip - kip ",
                "Slug - slug ", "Pound-energy square second/foot - lb F sq s ft-1 ", "Pound (troy or apothecary) - lb",
                "Poundal - pdl", "Ton (assay) (UK) - AT)", "Ton (assay) (US) - AT)", "Kiloton (metric) - kt",
                "Qunital (metric) -  cwt", "Hundredweight (US) - hwt ", "Hundredweight (UK) - hwt",
                "Quarter (US) - qr ", "Quarter (UK) - qr ", "Stone (US) - st", "Stone (UK) - st",
                "Sonne - t", "Pennyweight - pwt", "Scruple (apothecary)- s.ap", "Grain - gr",
                "Gamma - gamma", "Talent (Biblical Hebrew) - talent ", "Mina (Biblical Hebrew) - mina",
                "Shekal (Biblical Hebrew) - shekal", "Bekan (Biblical Hebrew) - bekan", "Gereh (Biblical Hebrew) - gereh",
                "Talent (Biblical Greek) - talent", "Mina (Biblical Greek) - mina ", "Tetradrachma (Biblical Greek) - tetd",
                "Didrachma (Biblical Greek) - didrachma", "Drachma (Biblical Greek) - drachma ", "Denarius (Biblical Roman) - denarius",
                "Assarion (Biblical Roman) - assarion", "Quadrans (Biblical Roman) -  quadranns","Lepton (Biblical Roman) - lepton",
                "Planck mass - Planck mass", "Electron mass (rest) -  e-","Muon mass - M",
                "Proton mass - p", "Neutron mass - n ", "Deuteron mass - D",
                "Earth's mass - Earth", "Sun mass - Sun",

                //volume
                "Cubic meter - m^3", "Cubic kilometer  - km^3", "Cubic centimeter  - cm^3",
                "Cubic millimeter - mm^3", "Liter - L", "Milliliter  - mL",
                "Gallons(US) - gallon", "Quart(US) - qt", "Pint(US)  - pt", "Cup(US)  - cup",
                "Tablespoon - tblsp", "Teaspoon - tsp", "Cubic mile - mi^3", "Cubic yard - yd^3",
                "Cubic foot - ft^3", "Cubic inch - in^3", "Cubic decimeter - dm^3", "Exaliter - EL",
                "Petaliter - PL", "Teraliter - TL", "Gigaliter - GL", "Megaliter - ML",
                "Kiloliter - kL", "Hectoliter - hL", "Dekaliter - daL", "Deciliter - dL",
                "Centiliter - cL", "Microliter - µL", "Nanoliter - nL", "Picoliter - pL",
                "Femtoliter - fL", "Attoliter - aL", "Cc - cc", "Drop - drop", "Barrel(oil) - bbl",
                "Barrel(US) - bbl", "Barrel(UK) - bbl", "Gallon - gallon", "Quart(UK) - qt",
                "Pint(UK) - pt", "Cup(Metric) - cup", "Cup(UK) - cup", "Fluid ounce(US) - fl oz",
                "Fluid ounce(UK) - fl oz", "Tablespoon(Metric) - tblsp", "Tablespoon(UK) - tblsp",
                "Dessertspoon(US) - dsp", "Dessertspoon(UK) - dsp", "Teaspoon(Metric) - tsp",
                "Teaspoon(UK) - tsp", "Gill(US)  - gi", "Gill(UK)  - gi", "Minim(US)  - min",
                "Minim(UK)  - min", "Ton register - ton reg", "Ccf  - ccf",
                "Hundred-cubic foot - 100 ft^3", "Acre-foot - ac*ft", "Acre-foot(US)  - ac*ft", "Acre-inch - ac*in",
                "Dekastere  - daSt", "Stere  - st", "Decistere  - dSt", "Cord  - cd",
                "Tun  - tun", "Hogshead  - hogshead", "Board foot  - bft", "Dram  - dr", "Cor(Biblical) - cor", "Homer(Biblical) - homer",
                "Bath(Biblical) - bath", "Hin(Biblical) - hin", "Cab(Biblical) - cab", "Log(Biblical) - log", "Taza(Spanish) - taza", "Earth's volume - earth",

                //temperture
                "Celsius - °C", "Fahrenheit - °F",
                "Kelvin - °K", "Rankine - °R",
                "Newton - °N", "Reaumur - °Ré",
                "Romer - °Rø", "Delisle - °D",

                //area
                "Square Meter -  m²", "Square Kilometer - km²", "Square Centimeter - cm²",
                "Square Millimeter -  mm²", "Hectares - ha", "Acre - ac", "Square Mile -  mi²",
                "Square Yard - yd²", "Square Foot - ft²", "Square Inch - in²",
                "Square Micrometer -  μm²", "Square Hectometer - hm²", "Square Dekameter - dam²",
                "Square Decimeter -  dm²", "Nanometer - nm²", "Are - a", "Barn -  b",
                "Square Mile (US survey)", "Square Foot (US survey)", "Circular Inch ",

                "Township", "Section", "Acre(US survey) - ac", "Rood", "Square Chain - ch²",
                "Square rod", "Square rod (US survey)", "Square Perch ", "Square Pole ",
                "Square Mil - mil² ", "Cirular Mil", "Homestead", "Sabin", "Arpent", "Cuerda",
                "Plaza", "Varas Castellanas Cuad", "Varas Conuqueras Cuad", "Electron Cross Section ",

                //pressure
                "Pascal - Pa",
                "Kilopascal - kPa",
                "Bar - b",
                "Psi - psi",
                "Ksi - ksi",
                "Atmosphere - atm",
                "Exapascal - EPa",
                "Petapascal - PPa",
                "Terapascal - TPa",
                "Gigapascal - GPa",
                "Megapascal - MPa",
                "Hectopascal - hPa",
                "Deckapascal - daPa",
                "Decipascal - dPa",
                "Centipascal - cPa",
                "Millipascal - mPa",
                "Micropascal - μPa",
                "Nanopascal - nPa",
                "Picopascal - pPa",
                "Femtopascal - fPa",
                "Attopascal - aPa",
                "Newton/square meter - N/m²",
                "Newton/square centimeter - N/cm²",
                "Newton/square millimeter - N/mm²",
                "Kilonewton/square meter - kN/m²",
                "Millibar - mbar",
                "Microbar - μbar",
                "Dyne/square centimeter - dyn/cm²",
                "Kilogram-energy/square meter - kgf/m²",
                "Kilogram-energy/square cm - kgf/cm²",
                "Kilogram-energy/square mm - kgf/mm²",
                "Gram-energy/square cm - gf/cm²",
                "Ton-energy(short)/sq. foot - tonf/ft²",
                "Ton-energy(short)/sq. inch - tonf/in²",
                "Ton-energy(long)/sq. foot - tonf/ft²",
                "Ton-energy(long)/sq. inch - tonf/in²",
                "Kip-energy/square inch - kipf/in²",
                "Pound-energy/square foot - lbf/ft²",
                "Pound-energy/square inch - lbf/in²",
                "Poundal/square foot - pdl/ft²",
                "Torr - torr",
                "Centimeter mercury(0°C) - cmHg",
                "Millimeter mercury(0°C) - mmHg",
                "Inch mercury(32°F) - inHg",
                "Centimeter water(4°C) - cmAq",
                "Millimeter water(4°C) - mmAq",
                "Inch water(4°C) - inAq",
                "Foot water(4°C) - ftAq",
                "Inch water(60°C) - inAq",
                "Foot water(60°C) - ftAq",
                "Atmosphere technical - at",

                //energy
                "Joule - J",
                "Kilo joule - kJ",
                "Kilo-watt hour - kW*h",
                "Watt-hour - W*h",
                "Calorie (nutritional) - cal(nutritional)",
                "Horsepower (metric) hour - hp*h",
                "Btu(IT) - btu(IT),Btu",
                "Btu(th) - btu(th)",
                "Giga joule - GJ",
                "Mega joule - MJ",
                "Milli joule - mJ",
                "Micro joule - μj",
                "Nano joule - nJ",
                "Atto joule - aJ",
                "Mega electron-volt - MeV",
                "Kilo electron-volt - KeV",
                "Electron-volt - eV",
                "Erg - erg",
                "Giga watt-hour - GW*h",
                "Mega watt-hour - MW*h",
                "Kilo watt-second - kW*s",
                "Watt-second - W*s",
                "Newton meter - N*m",
                "Horse power hour - hp*h",
                "Kilo calorie(IT) - kcal(IT)",
                "Kilo calorie(th) - kcal(th)",
                "Calorie(IT) - cal(IT),cal",
                "Calorie(th) - cal(th)",
                "Mega Btu (IT) - MBtu(IT)",
                "Ton-hour (refrigeration) - ton*h",
                "Fuel oil equivalent @kiloliter - kl",
                "Fuel oil equivalent @barrel (US)  - bbl",
                "Giga ton - Gton",
                "Mega ton - Mton",
                "Kilo ton - kton",
                "Ton (explosives) - ton",
                "Dyne centimeter - dyn*cm",
                "Gram-energy meter - gf*m",
                "Gram-energy centimeter - gf*cm",
                "Kilogram-energy centimeter - kgf*cm",
                "Kilogram-energy meter - kgf*m",
                "Kilo pond meter - kp*m",
                "Pound-energy foot - lbf*ft",
                "Pound-energy inch - lbf*in",
                "Ounce-energy inch - ozf*in",
                "Foot-pound - ft*lbf",
                "Inch-pound - in*lbf",
                "Inch-ounce - in*ozf",
                "Poundal foot - pdl*ft",
                "Therm - therm",
                "Therm(EC) - therm",
                "Therm(US) - therm",
                "Hartree energy - He",
                "Rydberg constant - Rc",

                //power
                "Watt -W",
                "Exawatt -EW",
                "Petawatt -PW",
                "Terawatt -TW",
                "Gigawatt -GW",
                "Megawatt -MW",
                "Kilowatt -kW",
                "Hectowatt -hW",
                "Dekawatt -daW",
                "Deciwatt -dW",
                "Centiwatt -cW",
                "Milliwatt -mW",
                "Microwatt -μW",
                "Nanowatt -nW",
                "Picowatt -pW",
                "Femtowatt -fW",
                "Attowatt -aW",
                "Horsepower -hp,hp(UK)",
                "Horsepower (550 ft*lbf/s) -hp,hp(UK)",
                "Horsepower (metric) -hp(metric)",
                "Horsepower (boiler) -hp(boiler)",
                "Horsepower (electric) -hp(electric)",
                "Horsepower (water) -hp(water)",
                "Pferdestarke (ps) -ps",
                "Btu (IT)/hour -Btu/h",
                "Btu (IT)/minute -Btu/min",
                "Btu (IT)/second -Btu/s",
                "Btu (th)/hour -Btu(th)/h",
                "Btu (th)/minute -Btu(th)/min",
                "Btu (th)/second -Btu(th)/s",
                "MBtu (IT)/hour -MBtu/h",
                "MBH -MBH",
                "Ton (refrigeration) -ton",
                "Kilocalorie (IT)/hour -kcal/h",
                "Kilocalorie (IT)/minute -kcal/min",
                "Kilocalorie (IT)/second -kcal/s",
                "Kilocalorie (th)/hour -kcal(th)/h",
                "Kilocalorie (th)/minute -kcal(th)/min",
                "Kilocalorie (th)/second -kcal(th)/s",
                "Calorie (IT)/hour -cal/h",
                "Calorie (IT)/minute -cal/min",
                "Calorie (IT)/second -cal/s",
                "Calorie (th)/hour -cal(th)/h",
                "Calorie (th)/minute -cal(th)/min",
                "Calorie (th)/second -cal(th)/s",
                "Foot pound-force/hour -lbf*ft/h",
                "Foot pound-force/minute -lbf*ft/min",
                "Foot pound-force/second -lbf*ft/s",
                "Pound-foot/hour -lbf*ft/h",
                "Pound-foot/minute -lbf*ft/min",
                "Pound-foot/second -lbf*ft/s",
                "Erg/second -erg/s",
                "Kilovolt ampere -kV*A",
                "Volt ampere -V*A",
                "Newton meter/second -N*m/s",
                "Joule/second -J/s",
                "Exajoule/second -EJ/s",
                "Petajoule/second -PJ/s",
                "Terajoule/second -TJ/s",
                "Gigajoule/second -GJ/s",
                "Megajoule/second -MJ/s",
                "Kilojoule/second -kJ/s",
                "Hectojoule/second -hJ/s",
                "Dekajoule/second -daJ/s",
                "Decijoule/second -dJ/s",
                "Centijoule/second -CJ/s",
                "Millijoule/second -mJ/s",
                "Microjoule/second -μJ/s",
                "Nanojoule/second -nJ/s",
                "Picojoule/second -pJ/S",
                "Femtojoule/second -fJ/s",
                "Attojoule/second -aJ/s",
                "Joule/hour -J/h",
                "Joule/minute -J/min",
                "Kilojoule/hour -kJ/h",
                "Kilojoule/minute -kJ/min",

                //force
                "Newton - N",
                "Kilonewton - kN",
                "Gram-force - gf",
                "Kilogram-force - kgf",
                "Ton-force(metric) - tf",
                "Exanewton - EN",
                "Petanewton - PT",
                "Teranewton - TN",
                "Giganewton - GN",
                "Meganewton - MN",
                "Hectonewton - hN",
                "Dekanewton - daN",
                "Decinewton - dN",
                "Centinewton - cN",
                "Milinewton - mN",
                "Micronewton - μN",
                "Nanonewton - nN",
                "Piconewton - pN",
                "Femtonewton - fN",
                "Attonewton - aN",
                "Dyne - dyn",
                "Joule/meter - J/m",
                "Joule/centimeter - J/cm",
                "Ton-force(short) - tonf",
                "Ton-force(long) - tonf",
                "Kip-force - kipf",
                "Kilopound-force- kipf",
                "Pound-force - lbf",
                "Ounce-force - ozf",
                "Poundal - pdl(force)",
                "Pound foot/square second - lb*ft/sec²",
                "Pond - p",
                "Kilopond - kp",


                //time
                "Second - s", "Millisecond - ms", "Minute - min", "Hour - h",
                "Day - d", "Week - week", "Month - month", "Year - y", "Decade - decade",
                "Century - century", "Millenium - millenium", "Microsecond - μs",
                "Nanosecond - ns", "Picosecond - ps", "Femtosecond - fs", "Attosecond - as", "Shake - shake",
                "Month(Synodic) - month", "Year(Julian) - y", "Year(leap) - y", "Year(tropical) - y", "Year(sidereal) - y",
                "Day(sidereal) - d", "Hour(sidereal) - h", "Minute(sidereal) - min", "Second(sidereal) - s", "Fortnight - f", "Septennial - s",
                "Octennial - o", "Novennial - n", "Quindecennial - q", "Quinquennial - q", "Plank time - pt",

                //speed
                "Meter/second - m/s",
                "Kilometer/hour - km/h", "Mile/hour - mi/h", "Meter/hour - m/h",
                "Meter/minute - m/min", "Kilometer/minute - km/min", "Kilometer/second - km/s",
                "Centimeter/hour - cm/h", "Centimeter/minute - cm/min", "Centimeter/second - cm/s", "Millimeter/hour - mm/h",
                "Millimeter/minute - mm/min", "Millimeter/second - mm/s", "Foot/hour - ft/h", "Foot/minute - ft/min",
                "Foot/second - ft/s", "Yard/hour - yd/h", "Yard/minute - yd/min", "Yard/second - yd/s",
                "Mile/minute - mi/min", "Mile/second - mi/s", "Knot - knots", "Knot (UK) - knots(UK)",
                "Velocity of light in vacuum - c", "Cosmic velocity - first - hom", "Cosmic velocity - second - cosmic",
                "Cosmic velocity - third - cosmic", "Earth's velocity - earth", "Velocity of sound in pure water - sound", "Velocity of sound in sea water - sound",
                "Mach - mach", "Mach (SI standard) - mach",

                //angle
                "Degree - °", "Radian - rad", "Grad - ^g",
                "Minute - '", "Second -  ″ ", "Gon - gon", "Sign - sign",
                "Mil - mil", "Revolution - r", "Circle - ∅", "Turn - turn",
                "Quadrant - 90°", "Right angle - 90°", "Sextant - 60°",

                //fuel
                "Meter/liter - m/L", "Exameter/liter - Em/L", "Petameter/liter - Pm/L", "Terameter/liter - Tm/L",
                "Gigameter/liter - Gm/L", "Megameter/liter - Mm/L", "Kilometer/liter - km/L", "Hectometer/liter - hm/L", "Dekameter/liter - dam/L", "Centimeter/liter - cm/L",
                "Mile(US)/liter - mi/L", "Nautical mile/liter - n.mile/L", "Nautical mile/gallon(US)  - n.mile/gallon",
                "Kilometer/gallon - km/gallon", "Meter/gallon(US) - m/gallon", "Meter/gallon(UK) - m/gallon", "Mile/gallon(US) - mi/gallon", "Mile/gallon(UK) - mi/gallon",
                "Meter/cubic meter - m/m^3", "Meter/cubic centimeter - m/cm^3", "Meter/cubic yard - m/yd^3", "Meter/cubic foot - m/ft^3", "Meter/cubic inch - m/in^3", "Meter/quart(US) - m/q", "Meter/quart(UK) - m/q",
                "Meter/pint(US) - m/pt", "Meter/pint(UK) - m/pt", "Meter/cup(US) - m/cup", "Meter/cup(UK) - m/cup", "Meter/fluid ounce(US) - m/floz", "Meter/fluid ounce(UK) - m/floz",
                "Liter/meter - L/m", "Liter/100 km - L/100 km", "Gallon(US)/mile - gallon/mi", "Gallon(US)/100 mile - gallon/100 mi",
                "Gallon(UK)/mile - gallon/mi", "Gallon(UK)/100 mile - gallon/100 mi",

                //datastorage
                "Bit - b", "Nibble - n", "Byte - B", "Character - ch",
                "Word - w", "MAPM-word - w", "Quadruple-word - w", "Block - blk",
                "Kilobit - kb", "Kilobyte - kB","Kilobyte (10^3 bytes) - kB", "Megabit - Mb", "Megabyte - MB",
                "Megabyte (10^6 bytes) - MB", "Gigabit - Gb", "Gigabyte - GB", "Gigabyte (10^9 bytes) - GB",
                "Terabit - Tb", "Terabyte - TB", "Terabyte (10^12 bytes) - TB", "Petabit - Pb", "Petabyte - PB",
                "Petabyte (10^15 bytes) - PB", "Exabit - Eb", "Exabyte - EB", "Exabyte (10^18 bytes) - EB", "Floppy disk (3.5″, DD) - floppy", "Floppy disk (3.5″, HD) - floppy",
                "Floppy disk (3.5″, ED) - floppy", "Floppy disk (5.25″, DD) - floppy", "Floppy disk (5.25″, HD) - floppy", "Zip 100 - Zip",
                "Zip 250 - Zip", "Jaz 1GB - Jaz", "Jaz 2GB - Jaz", "CD (74 minute) - CD",
                "CD (80 minute) - CD", "DVD (1 layer, 1 side) - DVD", "DVD (2 layer, 1 side) - DVD",
                "DVD (1 layer, 2 side) - DVD", "DVD (2 layer, 2 side) - DVD",

                //volumedry
                "Liter(volume) - L",
                "Barrel dry(US) - bbl dry",
                "Pint dry(US) - pt dry",
                "Quart dry(US) - qt dry",
                "Peck dry(US) - pk",
                "Peck dry(UK) - pk",
                "Bushel(US) - bu",
                "Bushel(UK) - bu",
                "Cor(Biblical volume) - cor",
                "Homer(Biblical volume) - homer",
                "Ephah(Biblical) - ephah",
                "Seah(Biblical volume) - seah",
                "Omer(Biblical volume) - omer",
                "Cab(Biblical volume) - cab",
                "Log(Biblical volume) - log",


                //cooking
                "Cup(Euro) - cup",
                "Cup(US) - cup",
                "Gram(cooking) - g",
                "Kilogram - kg",
                "Liter - li",
                "Milliliter - ml",
                "Ounce(cooking) - oz",
                "Fluid Ounce - floz",
                "Pint - pt",
                "Pound - lb",
                "Table Spoon(Euro) - tbsp",
                "Table Spoon(US) - tbsp",
                "Tea Spoon(Euro) - tsp",
                "Tea Spoon(US) - tsp",

                //datatransfer
                "Bit/second - b/s",
                "Byte/second - B/s",
                "Kilobit/second(SI def.)",
                "Kilobyte/second(SI def.)",
                "Kilobit/second - kb/s",
                "Kilobyte/second - kB/s",
                "Megabit/second(SI def.)",
                "Megabyte/second(SI def.)",
                "Megabit/second - Mb/s",
                "Megabyte/second - MB/s",
                "Gigabit/second(SI def.)",
                "Gigabyte/second(SI def.)",
                "Gigabit/second - Gb/s",
                "Gigabyte/second - GB/s",
                "Terabit/second(SI def.)",
                "Terabyte/second(SI def.)",
                "Terabit/second - Tb/s",
                "Terabyte/second - TB/S",
                "Ethernet",
                "Ethernet(fast)",
                "Ethernet(gigabit)",
                "OC1",
                "OC3",
                "OC12",
                "OC24",
                "OC48",
                "OC192",
                "OC768",
                "ISDN (single channel)",
                "ISDN(dual channel)",
                "Modem(110)",
                "Modem(300)",
                "Modem(1200)",
                "Modem(2400)",
                "Modem(9600)",
                "Modem(14.4k)",
                "Modem(28.8k)",
                "Modem(33.6k)",
                "Modem(56k)",
                "SCSI(Async)",
                "SCSI(Sync)",
                "SCSI(Fast)",
                "SCSI(Fast Ultra)",
                "SCSI(Fast Wide)",
                "SCSI(Fast Ultra Wide)",
                "SCSI(Ultra-2)",
                "SCSI(Ultra-3)",
                "SCSI(LVD Ultra 80)",
                "SCSI(LVD Ultra 160)",
                "IDE(PIO mode 0)",
                "IDE(PIO mode 1)",
                "IDE(PIO mode 2)",
                "IDE(PIO mode 3)",
                "IDE(PIO mode 4)",
                "IDE(DMA mode 0)",
                "IDE(DMA mode 1)",
                "IDE(DMA mode 2)",
                "IDE(UDMA mode 0)",
                "IDE(UDMAmode 1)",
                "IDE(UDMA mode 2)",
                "IDE(UDMA mode 3)",
                "IDE(UDMA mode 4)",
                "IDE(UDMA 33)",
                "IDE(UDMA 66)",
                "USB",
                "Firewire(IEEE-1394)",
                "T0(payload)",
                "T0(B8ZS payload)",
                "T1(signal)",
                "T1(payload)",
                "T1Z(payload)",
                "T1C(signal)",
                "T1C(payload)",
                "T2(signal)",
                "T3(signal)",
                "T3(payload)",
                "T3Z(payload)",
                "T4(signal)",
                "E.P.T.A.1(signal)",
                "E.P.T.A.1(payload)",
                "E.P.T.A.2(signal)",
                "E.P.T.A.2(payload)",
                "E.P.T.A.3(signal)",
                "E.P.T.A.3(payload)",
                "H0",
                "H11",
                "Virtual Tributary 1(signal)",
                "Virtual Tributary 1(payload)",
                "Virtual Tributary 2(signal)",
                "Virtual Tributary 2(payload)",
                "Virtual Tributary 6(signal)",
                "Virtual Tributary 6(payload)",
                "STS1(signal)",
                "STS1(payload)",
                "STS3(signal)",
                "STS3(payload)",
                "STS3c(signal)",
                "STS3c(payload)",
                "STS12(signal)",
                "STS24(signal)",
                "STS48(signal)",
                "STS192(signal)",
                "STM-1(signal)",
                "STM-4(signal)",
                "STM-16(signal)",
                "STM-64(signal)",


                //ImageActivity
                "Twip - twip",
                "Meter - m",
                "Centimeter - cm",
                "Millimeter - mm",
                "Inch - in",
                "Pixel(X) - pixel(x)",
                "Pixel(Y) - pixel(y)",
                "Character(X) - character(x)",
                "Character(Y) - character(y)",
                "Pica - P",
                "Point - pt",
                "En - en",


                //prefix
                "None - none",
                "Yotta - Y",
                "Zetta - Z",
                "Exa - E",
                "Peta - P",
                "Tera - T",
                "Giga - G",
                "Mega - M",
                "Kilo - k",
                "Hecto - h",
                "Deka - da",
                "Deci - d",
                "Centi - c",
                "Milli - m",
                "Micro - µ",
                "Nano - n",
                "Pico - p",
                "Femto - f",
                "Atto - a",
                "Zepto - z",
                "Yocto - y",

                //sound
                "Bel - B",
                "Decible - dB",
                "Neper - Np",

                //typography
                "Twip(typography) - twip",
                "Meter(typography) - m",
                "Centimeter(typography) - cm",
                "Millimeter(typography) - mm",
                "Character(X)(typography) - character(x)",
                "Character(Y)(typography) - character(y)",
                "Pixel(X)(typography) - pixel(x)",
                "Pixel(Y)(typography) - pixel(y)",
                "Inch(typography) - in",
                "Pica(Computer) - pica",
                "Pica(Printer) - pica",
                "PostScript point - psp",
                "Point(Computer) - pt",
                "Point(Printer) - pt",
                "En(typography) - en",

                //voulme lumber
                "Cubic meter - m³",
                "Cubic foot - ft³",
                "Cubic inch - in³",
                "Board feet - boardfeet",
                "Thousand board feet - thousand board feet",
                "Cord - cord",
                "Cord(80 cubic ft) - cord",
                "Cord feet - cordfeet",
                "Cunit - cunit",
                "Pallet - pallet",
                "Cross tie - crosstie",
                "Switch tie - switchtie",
                "Thousand square feet (1/8inch panels) - ft²",
                "Thousand square feet (1/4inch panels) - ft²",
                "Thousand square feet (3/8inch panels) - ft²",
                "Thousand square feet (1/2inch panels) - ft²",
                "Thousand square feet (3/4inch panels) - ft²",

                //work
                "Joule(work) - J",
                "Kilojoule - kJ",
                "Calorie - cal",
                "Kilocalorie - kcal",
                "Kilowatt hour - kw*h",
                "Kilogram force meter - kgf*m",
                "Inch pound - in*lbf",
                "Foot pound - ft*lbf",
                "Btu - btu"

        };

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, listitem);
        lv.setAdapter(adapter);

        /*Collections.sort(lv, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });*/

        inputSearch.addTextChangedListener(this);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterView, View view, int position, long id) {

                //Do some more stuff here and launch new activity
                selectedItem = (String)adapterView.getItemAtPosition(position);
                //  Toast.makeText(SearchActivity.this,"Position"+selectedItem,Toast.LENGTH_LONG).show();
                switch(selectedItem)
                {
                    //Length
                    case  "Meter -m":
                        length();
                        break;
                    case  "Kilometer -km":
                        length();
                        break;
                    case  "Decimeter -dm":
                        length();
                        break;
                    case  "Centimeter -cm":
                        length();
                        break;
                    case  "Millimeter -mm":
                        length();
                        break;
                    case  "Micrometer -μm":
                        length();
                        break;
                    case  "Nanometer -nm":
                        length();
                        break;
                    case  "Mile -mi,mi(Int)":
                        length();
                        break;
                    case  "Yard -yd":
                        length();
                        break;
                    case  "Foot -ft":
                        length();
                        break;
                    case  "Inch -in":
                        length();
                        break;
                    case  "Light year -ly":
                        length();
                        break;
                    case  "Exameter -Em":
                        length();
                        break;
                    case  "Petameter -Pm":
                        length();
                        break;
                    case  "Terameter -Tm":
                        length();
                        break;
                    case  "Gigameter -Gm":
                        length();
                        break;
                    case  "Megameter -Mm":
                        length();
                        break;
                    case  "Hectometer -hm":
                        length();
                        break;
                    case  "Dekameter -dam":
                        length();
                        break;
                    case  "Micron -μ":
                        length();
                        break;
                    case  "Picometer -pm":
                        length();
                        break;
                    case  "Femtometer -fm":
                        length();
                        break;
                    case  "Attometer -am":
                        length();
                        break;
                    case  "Megaparsec -Mpc":
                        length();
                        break;
                    case  "Kiloparsec -kpc":
                        length();
                        break;
                    case  "Parsec -pc":
                        length();
                        break;
                    case  "Astronomical unit -AU,UA":
                        length();
                        break;
                    case  "League -lea":
                        length();
                        break;
                    case  "Nautical league (UK) -n.lea(UK)":
                        length();
                        break;
                    case  "Nautical league (int.) -n.lea":
                        length();
                        break;
                    case  "League (statute) -lea(US)":
                        length();
                        break;
                    case  "Nautical mile (UK) -n.mi":
                        length();
                        break;
                    case  "Nautical mile (international) -n.mi":
                        length();
                        break;
                    case  "Mile (statute) -mi,mi(US)":
                        length();
                        break;
                    case  "Mile (US survey) -mi,mi(US)":
                        length();
                        break;
                    case  "Mile (Roman)-mile":
                        length();
                        break;
                    case  "Kiloyard -kyd":
                        length();
                        break;
                    case  "Furlong -fur":
                        length();
                        break;
                    case  "Furlong (US survey) -fur":
                        length();
                        break;
                    case  "Chain -ch":
                        length();
                        break;
                    case  "Chain (US survey) -ch":
                        length();
                        break;
                    case  "Rope -rope":
                        length();
                        break;
                    case  "Rod -rd":
                        length();
                        break;
                    case  "Rod (US survey) -rd":
                        length();
                        break;
                    case  "Perch -perch":
                        length();
                        break;
                    case  "Pole -pole":
                        length();
                        break;
                    case  "Fathom -fath":
                        length();
                        break;
                    case  "Fathom (US survey) -fath":
                        length();
                        break;
                    case  "Ell -ell":
                        length();
                        break;
                    case  "Foot (US survey) -ft":
                        length();
                        break;
                    case  "Link -li":
                        length();
                        break;
                    case  "Link (US survey) -li":
                        length();
                        break;
                    case  "Cubit (UK) -cubit":
                        length();
                        break;
                    case  "Hand -hand":
                        length();
                        break;
                    case  "Span (cloth) -span":
                        length();
                        break;
                    case  "Finger (cloth) -finger":
                        length();
                        break;
                    case  "Nail (cloth) -nail":
                        length();
                        break;
                    case  "Inch (US survey) -in":
                        length();
                        break;
                    case  "Barleycorn -barleycorn":
                        length();
                        break;
                    case  "Mil -mil,thou":
                        length();
                        break;
                    case  "Microinch -μ.in":
                        length();
                        break;
                    case  "Angstrom -A":
                        length();
                        break;
                    case  "A.u. of length -a.u.,b":
                        length();
                        break;
                    case  "X-unit -X":
                        length();
                        break;
                    case  "Fermi -F,f":
                        length();
                        break;
                    case  "Arpent -Arpent":
                        length();
                        break;
                    case  "Pica -pica":
                        length();
                        break;
                    case  "Point -Point":
                        length();
                        break;
                    case  "Twip  -twip":
                        length();
                        break;
                    case  "Aln -aln":
                        length();
                        break;
                    case  "Famn -famn":
                        length();
                        break;
                    case  "Caliber -cl":
                        length();
                        break;
                    case  "Centiinch -cin":
                        length();
                        break;
                    case  "Ken -ken":
                        length();
                        break;
                    case  "Russian archin -archin":
                        length();
                        break;
                    case  "Roman actus -actus":
                        length();
                        break;
                    case  "Vara de tarea -v.de.t":
                        length();
                        break;
                    case  "Vara conuquera -vc":
                        length();
                        break;
                    case  "Vara castellana -vcas":
                        length();
                        break;
                    case  "Cubit (Greek) -cubit":
                        length();
                        break;
                    case  "Long reed -lreed": length();
                        break;
                    case  "Reed -reed": length();
                        break;
                    case  "Long cubit -long cubit": length();
                        break;
                    case  "Handbreadth -hb": length();
                        break;
                    case  "Fingerbreadth -fb": length();
                        break;
                    case  "Planck length -Planck": length();
                        break;
                    case  "Electron radius (classical) -e-rad": length();
                        break;
                    case  "Bohr radius -b,a.u.": length();
                        break;
                    case  "Earth's equatorial radius -Earth": length();
                        break;
                    case  "Earth's polar radius -Earth": length();
                        break;
                    case  "Earth's distance from sun -Earth": length();
                        break;
                    case  "Sun's radius -Sun": length();
                        break;


                    //weight
                    case "Kilogram -  kg" :
                        weight();
                        break;
                    case "Gram - g" :
                        weight();
                        break;
                    case "Milligram - mg" :
                        weight();
                        break;
                    case "Ton - t" :
                        weight();
                        break;
                    case "Pound - lbs" :
                        weight();
                        break;
                    case "Ounce - oz" :
                        weight();
                        break;
                    case "Carat - ct" :
                        weight();
                        break;
                    case "Ton short US - ton" :
                        weight();
                        break;
                    case "Ton long UK - ton" :
                        weight();
                        break;
                    case "Atomic mass unit - u" :
                        weight();
                        break;

                    case "Exagram -  Eg" :
                        weight();
                        break;
                    case "Petagram - Pg" :
                        weight();
                        break;
                    case "Teragram - Tg" :
                        weight();
                        break;
                    case "Gigagram -  Gg" :
                        weight();
                        break;
                    case "Megagram - Mg" :
                        weight();
                        break;
                    case "Hectogram - hg" :
                        weight();
                        break;
                    case "Dekagram -  dag" :
                        weight();
                        break;
                    case "Decigram - dg" :
                        weight();
                        break;
                    case "Centigram - cg" :
                        weight();
                        break;
                    case "Microgram - μg" :
                        weight();
                        break;

                    case "Nanogram  - ng" :
                        weight();
                        break;
                    case "Picogram -  pg" :
                        weight();
                        break;
                    case "Femtogram - fg" :
                        weight();
                        break;
                    case "Attogram - ag" :
                        weight();
                        break;
                    case "Dalton - dt" :
                        weight();
                        break;
                    case "Kilogram-energy square second/meter - kg F sq s m- 1" :
                        weight();
                        break;
                    case "Kilopound - kip" :
                        weight();
                        break;
                    case "Kip - kip " :
                        weight();
                        break;
                    case "Slug - slug " :
                        weight();
                        break;
                    case "Pound-energy square second/foot - lb F sq s ft-1 " :
                        weight();
                        break;

                    case "Pound (troy or apothecary) - lb" :
                        weight();
                        break;
                    case "Poundal - pdl" :
                        weight();
                        break;
                    case "Ton (assay) (UK) - AT)" :
                        weight();
                        break;
                    case "Ton (assay) (US) - AT)" :
                        weight();
                        break;
                    case "Kiloton (metric) - kt" :
                        weight();
                        break;
                    case "Qunital (metric) -  cwt" :
                        weight();                         break;
                    case "Hundredweight (US) - hwt " : weight();                         break;
                    case "Hundredweight (UK) - hwt" : weight();                         break;
                    case "Quarter (US) - qr " : weight();                         break;

                    case "Quarter (UK) - qr " : weight();                         break;
                    case "Stone (US) - st" : weight();                         break;
                    case "Stone (UK) - st" : weight();                         break;
                    case "Sonne - t" : weight();                         break;
                    case "Pennyweight - pwt" : weight();                         break;
                    case "Scruple (apothecary)- s.ap" : weight();                         break;
                    case "Grain - gr" : weight();                         break;
                    case "Gamma - gamma" : weight();                         break;
                    case "Talent (Biblical Hebrew) - talent " : weight();                         break;

                    case "Mina (Biblical Hebrew) - mina" : weight();                         break;
                    case "Shekal (Biblical Hebrew) - shekal" : weight();                         break;
                    case "Bekan (Biblical Hebrew) - bekan" : weight();                         break;
                    case "Gereh (Biblical Hebrew) - gereh" : weight();                         break;
                    case "Talent (Biblical Greek) - talent" : weight();                         break;
                    case "Mina (Biblical Greek) - mina " : weight();                         break;
                    case "Tetradrachma (Biblical Greek) - tetd" : weight();                         break;
                    case "Didrachma (Biblical Greek) - didrachma" : weight();                         break;
                    case "Drachma (Biblical Greek) - drachma " : weight();                         break;

                    case "Denarius (Biblical Roman) - denarius" : weight();                         break;
                    case "Assarion (Biblical Roman) - assarion" : weight();                         break;
                    case "Quadrans (Biblical Roman) -  quadranns" : weight();                         break;
                    case "Lepton (Biblical Roman) - lepton" : weight();                         break;
                    case "Planck mass - Planck mass" : weight();                         break;
                    case "Electron mass (rest) -  e-" : weight();                         break;
                    case "Muon mass - M" : weight();                         break;
                    case "Proton mass - p" : weight();                         break;
                    case "Neutron mass - n " : weight();                         break;

                    case "Deuteron mass - D" : weight();                         break;
                    case "Earth's mass - Earth" : weight();                         break;
                    case "Sun mass - Sun" :
                        weight();
                        break;


                    //volume
                    case "Cubic meter - m^3":volume();break;
                    case "Cubic kilometer  - km^3" : volume();                         break;
                    case "Cubic centimeter  - cm^3" : volume();                         break;
                    case "Cubic millimeter - mm^3" : volume();                         break;
                    case "Liter - L" : volume();                         break;
                    case "Milliliter  - mL" : volume();                         break;
                    case "Gallons(US) - gallon" : volume();                         break;
                    case "Quart(US) - qt" : volume();                         break;
                    case "Pint(US)  - pt" : volume();                         break;
                    case "Cup(US)  - cup" : volume();                         break;
                    case "Tablespoon - tblsp" : volume();                         break;
                    case "Teaspoon - tsp" : volume();                         break;
                    case "Cubic mile - mi^3" : volume();                         break;
                    case "Cubic yard - yd^3" : volume();                         break;
                    case "Cubic foot - ft^3" : volume();                         break;
                    case "Cubic inch - in^3" : volume();                         break;
                    case "Cubic decimeter - dm^3" : volume();                         break;
                    case "Exaliter - EL" : volume();                         break;
                    case "Petaliter - PL" : volume();                         break;
                    case "Teraliter - TL" : volume();                         break;
                    case "Gigaliter - GL" : volume();                         break;
                    case "Megaliter - ML" : volume();                         break;
                    case "Kiloliter - kL" : volume();                         break;
                    case "Hectoliter - hL" : volume();                         break;
                    case "Dekaliter - daL" : volume();                         break;
                    case "Deciliter - dL" : volume();                         break;
                    case "Centiliter - cL" : volume();                         break;
                    case "Microliter - µL" : volume();                         break;
                    case "Nanoliter - nL" : volume();                         break;
                    case "Picoliter - pL" : volume();                         break;
                    case "Femtoliter - fL" : volume();                         break;
                    case "Attoliter - aL" : volume();                         break;
                    case "Cc - cc" : volume();                         break;
                    case "Drop - drop" : volume();                         break;
                    case "Barrel(oil) - bbl" : volume();                         break;
                    case "Barrel(US) - bbl" : volume();                         break;
                    case "Barrel(UK) - bbl" : volume();                         break;
                    case "Gallon - gallon" : volume();                         break;
                    case "Quart(UK) - qt" : volume();                         break;
                    case "Pint(UK) - pt" : volume();                         break;
                    case "Cup(Metric) - cup" : volume();                         break;
                    case "Cup(UK) - cup" : volume();                         break;
                    case "Fluid ounce(US) - fl oz" : volume();                         break;
                    case "Fluid ounce(UK) - fl oz" : volume();                         break;
                    case "Tablespoon(Metric) - tblsp" : volume();                         break;
                    case "Tablespoon(UK) - tblsp" : volume();                         break;
                    case "Dessertspoon(US) - dsp" : volume();                         break;
                    case "Dessertspoon(UK) - dsp" : volume();                         break;
                    case "Teaspoon(Metric) - tsp" : volume();                         break;
                    case "Teaspoon(UK) - tsp" : volume();                         break;
                    case "Gill(US)  - gi" : volume();                         break;
                    case "Gill(UK)  - gi" : volume();                         break;
                    case "Minim(US)  - min" : volume();                         break;
                    case "Minim(UK)  - min" : volume();                         break;
                    case "Ton register - ton reg" : volume();                         break;
                    case "Ccf  - ccf" : volume();                         break;
                    case "Hundred-cubic foot - 100 ft^3" : volume();                         break;
                    case "Acre-foot - ac*ft" : volume();                         break;
                    case "Acre-foot(US)  - ac*ft" : volume();                         break;
                    case "Acre-inch - ac*in" : volume();                         break;
                    case "Dekastere  - daSt" : volume();                         break;
                    case "Stere  - st" : volume();                         break;
                    case "Decistere  - dSt" : volume();                         break;
                    case "Cord  - cd" : volume();                         break;
                    case "Tun  - tun" : volume();                         break;
                    case "Hogshead  - hogshead" : volume();                         break;
                    case "Board foot  - bft" : volume();                         break;
                    case "Dram  - dr" : volume();                         break;
                    case "Cor(Biblical) - cor" : volume();                         break;
                    case "Homer(Biblical) - homer" : volume();                         break;
                    case "Bath(Biblical) - bath" : volume();                         break;
                    case "Hin(Biblical) - hin" : volume();                         break;
                    case "Cab(Biblical) - cab" : volume();                   break;
                    case "Log(Biblical) - log" : volume();                         break;
                    case "Taza(Spanish) - taza" : volume();                         break;
                    case "Earth's volume - earth"  : volume();                         break;
                    //temperture
                    case "Celsius - °C":
                        temperture();
                        break;
                    case "Fahrenheit - °F":
                        temperture();
                        break;
                    case "Kelvin - °K":
                        temperture();
                        break;
                    case "Rankine - °R":
                        temperture();
                        break;
                    case "Newton - °N":
                        temperture();
                        break;
                    case "Reaumur - °Ré":
                        temperture();
                        break;
                    case "Romer - °Rø":
                        temperture();
                        break;
                    case "Delisle - °D":
                        temperture();
                        break;


                    //area
                    case "Square Meter -  m²": area();  break;
                    case "Square Kilometer - km²": area();  break;
                    case "Square Centimeter - cm²": area();  break;
                    case "Square Millimeter -  mm²": area();  break;
                    case "Hectares - ha": area();  break;
                    case "Acre - ac": area();  break;
                    case "Square Mile -  mi²": area();  break;
                    case "Square Yard - yd²": area();  break;
                    case "Square Foot - ft²": area();  break;
                    case "Square Inch - in²": area();  break;

                    case "Square Micrometer -  μm²": area();  break;
                    case "Square Hectometer - hm²": area();  break;
                    case "Square Dekameter - dam²": area();  break;
                    case "Square Decimeter -  dm²": area();  break;
                    case "Nanometer - nm²": area();  break;
                    case "Are - a": area();  break;
                    case "Barn -  b": area();  break;
                    case "Square Mile (US survey)": area();  break;
                    case "Square Foot (US survey)": area();  break;
                    case "Circular Inch ": area();  break;

                    case "Township": area();  break;
                    case "Section": area();  break;
                    case "Acre(US survey) - ac": area();  break;
                    case "Rood": area();  break;
                    case "Square Chain - ch²": area();  break;
                    case "Square rod": area();  break;
                    case "Square rod (US survey)": area();  break;
                    case "Square Perch ": area();  break;
                    case "Square Pole ": area();  break;
                    case "Square Mil - mil² ": area();  break;

                    case "Cirular Mil": area();  break;
                    case "Homestead": area();  break;
                    case "Sabin": area();  break;
                    case "Arpent": area();  break;
                    case "Cuerda": area();  break;
                    case "Plaza": area();  break;
                    case "Varas Castellanas Cuad": area();  break;
                    case "Varas Conuqueras Cuad": area();  break;
                    case "Electron Cross Section ": area();  break;

                    //pressure
                    case "Pascal - Pa": pressure();  break;
                    case "Kilopascal - kPa": pressure();  break;
                    case "Bar - b": pressure();  break;
                    case "Psi - psi": pressure();  break;
                    case "Ksi - ksi": pressure();  break;
                    case "Atmosphere - atm": pressure();  break;
                    case "Exapascal - EPa": pressure();  break;
                    case "Petapascal - PPa": pressure();  break;
                    case "Terapascal - TPa": pressure();  break;
                    case "Gigapascal - GPa": pressure();  break;
                    case "Megapascal - MPa": pressure();  break;
                    case "Hectopascal - hPa": pressure();  break;
                    case "Deckapascal - daPa": pressure();  break;
                    case "Decipascal - dPa": pressure();  break;
                    case "Centipascal - cPa": pressure();  break;
                    case "Millipascal - mPa": pressure();  break;
                    case "Micropascal - μPa": pressure();  break;
                    case "Nanopascal - nPa": pressure();  break;
                    case "Picopascal - pPa": pressure();  break;
                    case "Femtopascal - fPa": pressure();  break;
                    case "Attopascal - aPa": pressure();  break;
                    case "Newton/square meter - N/m²": pressure();  break;
                    case "Newton/square centimeter - N/cm²": pressure();  break;
                    case "Newton/square millimeter - N/mm²": pressure();  break;
                    case "Kilonewton/square meter - kN/m²": pressure();  break;
                    case "Millibar - mbar": pressure();  break;
                    case "Microbar - μbar": pressure();  break;
                    case "Dyne/square centimeter - dyn/cm²": pressure();  break;
                    case "Kilogram-energy/square meter - kgf/m²": pressure();  break;
                    case "Kilogram-energy/square cm - kgf/cm²": pressure();  break;
                    case "Kilogram-energy/square mm - kgf/mm²": pressure();  break;
                    case "Gram-energy/square cm - gf/cm²": pressure();  break;
                    case "Ton-energy(short)/sq. foot - tonf/ft²": pressure();  break;
                    case "Ton-energy(short)/sq. inch - tonf/in²": pressure();  break;
                    case "Ton-energy(long)/sq. foot - tonf/ft²": pressure();  break;
                    case "Ton-energy(long)/sq. inch - tonf/in²": pressure();  break;
                    case "Kip-energy/square inch - kipf/in²": pressure();  break;
                    case "Pound-energy/square foot - lbf/ft²": pressure();  break;
                    case "Pound-energy/square inch - lbf/in²": pressure();  break;
                    case "Poundal/square foot - pdl/ft²": pressure();  break;
                    case "Torr - torr": pressure();  break;
                    case "Centimeter mercury(0°C) - cmHg": pressure();  break;
                    case "Millimeter mercury(0°C) - mmHg": pressure();  break;
                    case "Inch mercury(32°F) - inHg": pressure();  break;
                    case "Centimeter water(4°C) - cmAq": pressure();  break;
                    case "Millimeter water(4°C) - mmAq": pressure();  break;
                    case "Inch water(4°C) - inAq": pressure();  break;
                    case "Foot water(4°C) - ftAq": pressure();  break;
                    case "Inch water(60°C) - inAq": pressure();  break;
                    case "Foot water(60°C) - ftAq": pressure();  break;
                    case "Atmosphere technical - at": pressure();  break;

                    //energy
                    case "Joule - J" : energy(); break;
                    case "Kilo joule - kJ" : energy(); break;
                    case "Kilo-watt hour - kW*h" : energy(); break;
                    case "Watt-hour - W*h" : energy(); break;
                    case "Calorie (nutritional) - cal(nutritional)" : energy(); break;
                    case "Horsepower (metric) hour - hp*h" : energy(); break;
                    case "Btu(IT) - btu(IT),Btu" : energy(); break;
                    case "Btu(th) - btu(th)" : energy(); break;
                    case "Giga joule - GJ" : energy(); break;
                    case "Mega joule - MJ" : energy(); break;
                    case "Milli joule - mJ" : energy(); break;
                    case "Micro joule - μj" : energy(); break;
                    case "Nano joule - nJ" : energy(); break;
                    case "Atto joule - aJ" : energy(); break;
                    case "Mega electron-volt - MeV" : energy(); break;
                    case "Kilo electron-volt - KeV" : energy(); break;
                    case "Electron-volt - eV" : energy(); break;
                    case "Erg - erg" : energy(); break;
                    case "Giga watt-hour - GW*h" : energy(); break;
                    case "Mega watt-hour - MW*h" : energy(); break;
                    case "Kilo watt-second - kW*s" : energy(); break;
                    case "Watt-second - W*s" : energy(); break;
                    case "Newton meter - N*m" : energy(); break;
                    case "Horse power hour - hp*h" : energy(); break;
                    case "Kilo calorie(IT) - kcal(IT)" : energy(); break;
                    case "Kilo calorie(th) - kcal(th)" : energy(); break;
                    case "Calorie(IT) - cal(IT),cal" : energy(); break;
                    case "Calorie(th) - cal(th)" : energy(); break;
                    case "Mega Btu (IT) - MBtu(IT)" : energy(); break;
                    case "Ton-hour (refrigeration) - ton*h" : energy(); break;
                    case "Fuel oil equivalent @kiloliter - kl" : energy(); break;
                    case "Fuel oil equivalent @barrel (US)  - bbl" : energy(); break;
                    case "Giga ton - Gton" : energy(); break;
                    case "Mega ton - Mton" : energy(); break;
                    case "Kilo ton - kton" : energy(); break;
                    case "Ton (explosives) - ton" : energy(); break;
                    case "Dyne centimeter - dyn*cm" : energy(); break;
                    case "Gram-energy meter - gf*m" : energy(); break;
                    case "Gram-energy centimeter - gf*cm" : energy(); break;
                    case "Kilogram-energy centimeter - kgf*cm" : energy(); break;
                    case "Kilogram-energy meter - kgf*m" : energy(); break;
                    case "Kilo pond meter - kp*m" : energy(); break;
                    case "Pound-energy foot - lbf*ft" : energy(); break;
                    case "Pound-energy inch - lbf*in" : energy(); break;
                    case "Ounce-energy inch - ozf*in" : energy(); break;
                    case "Foot-pound - ft*lbf" : energy(); break;
                    case "Inch-pound - in*lbf" : energy(); break;
                    case "Inch-ounce - in*ozf" : energy(); break;
                    case "Poundal foot - pdl*ft" : energy(); break;
                    case "Therm - therm" : energy(); break;
                    case "Therm(EC) - therm" : energy(); break;
                    case "Therm(US) - therm" : energy(); break;
                    case "Hartree energy - He" : energy(); break;
                    case "Rydberg constant - Rc" : energy(); break;

                    //power
                    case "Watt -W": power(); break;
                    case "Exawatt -EW": power(); break;
                    case "Petawatt -PW": power(); break;
                    case "Terawatt -TW": power(); break;
                    case "Gigawatt -GW": power(); break;
                    case "Megawatt -MW": power(); break;
                    case "Kilowatt -kW": power(); break;
                    case "Hectowatt -hW": power(); break;
                    case "Dekawatt -daW": power(); break;
                    case "Deciwatt -dW": power(); break;
                    case "Centiwatt -cW": power(); break;
                    case "Milliwatt -mW": power(); break;
                    case "Microwatt -μW": power(); break;
                    case "Nanowatt -nW": power(); break;
                    case "Picowatt -pW": power(); break;
                    case "Femtowatt -fW": power(); break;
                    case "Attowatt -aW": power(); break;
                    case "Horsepower -hp,hp(UK)": power(); break;
                    case "Horsepower (550 ft*lbf/s) -hp,hp(UK)": power(); break;
                    case "Horsepower (metric) -hp(metric)": power(); break;
                    case "Horsepower (boiler) -hp(boiler)": power(); break;
                    case "Horsepower (electric) -hp(electric)": power(); break;
                    case "Horsepower (water) -hp(water)": power(); break;
                    case "Pferdestarke (ps) -ps": power(); break;
                    case "Btu (IT)/hour -Btu/h": power(); break;
                    case "Btu (IT)/minute -Btu/min": power(); break;
                    case "Btu (IT)/second -Btu/s": power(); break;
                    case "Btu (th)/hour -Btu(th)/h": power(); break;
                    case "Btu (th)/minute -Btu(th)/min": power(); break;
                    case "Btu (th)/second -Btu(th)/s": power(); break;
                    case "MBtu (IT)/hour -MBtu/h": power(); break;
                    case "MBH -MBH": power(); break;
                    case "Ton (refrigeration) -ton": power(); break;
                    case "Kilocalorie (IT)/hour -kcal/h": power(); break;
                    case "Kilocalorie (IT)/minute -kcal/min": power(); break;
                    case "Kilocalorie (IT)/second -kcal/s": power(); break;
                    case "Kilocalorie (th)/hour -kcal(th)/h": power(); break;
                    case "Kilocalorie (th)/minute -kcal(th)/min": power(); break;
                    case "Kilocalorie (th)/second -kcal(th)/s": power(); break;
                    case "Calorie (IT)/hour -cal/h": power(); break;
                    case "Calorie (IT)/minute -cal/min": power(); break;
                    case "Calorie (IT)/second -cal/s": power(); break;
                    case "Calorie (th)/hour -cal(th)/h": power(); break;
                    case "Calorie (th)/minute -cal(th)/min": power(); break;
                    case "Calorie (th)/second -cal(th)/s": power(); break;
                    case "Foot pound-force/hour -lbf*ft/h": power(); break;
                    case "Foot pound-force/minute -lbf*ft/min": power(); break;
                    case "Foot pound-force/second -lbf*ft/s": power(); break;
                    case "Pound-foot/hour -lbf*ft/h": power(); break;
                    case "Pound-foot/minute -lbf*ft/min": power(); break;
                    case "Pound-foot/second -lbf*ft/s": power(); break;
                    case "Erg/second -erg/s": power(); break;
                    case "Kilovolt ampere -kV*A": power(); break;
                    case "Volt ampere -V*A": power(); break;
                    case "Newton meter/second -N*m/s": power(); break;
                    case "Joule/second -J/s": power(); break;
                    case "Exajoule/second -EJ/s" : power(); break;
                    case "Petajoule/second -PJ/s" : power(); break;
                    case "Terajoule/second -TJ/s" : power(); break;
                    case "Gigajoule/second -GJ/s" : power(); break;
                    case "Megajoule/second -MJ/s" : power(); break;
                    case "Kilojoule/second -kJ/s" : power(); break;
                    case "Hectojoule/second -hJ/s" : power(); break;
                    case "Dekajoule/second -daJ/s" : power(); break;
                    case "Decijoule/second -dJ/s" : power(); break;
                    case "Centijoule/second -CJ/s" : power(); break;
                    case "Millijoule/second -mJ/s" : power(); break;
                    case "Microjoule/second -μJ/s" : power(); break;
                    case "Nanojoule/second -nJ/s" : power(); break;
                    case "Picojoule/second -pJ/S" : power(); break;
                    case "Femtojoule/second -fJ/s" : power(); break;
                    case "Attojoule/second -aJ/s" : power(); break;
                    case "Joule/hour -J/h" : power(); break;
                    case "Joule/minute -J/min" : power(); break;
                    case "Kilojoule/hour -kJ/h" : power(); break;
                    case "Kilojoule/minute -kJ/min" : power(); break;

                    //force
                    case "Newton - N" : force(); break;
                    case "Kilonewton - kN" : force(); break;
                    case "Gram-force - gf" : force(); break;
                    case "Kilogram-force - kgf" : force(); break;
                    case "Ton-force(metric) - tf" : force(); break;
                    case "Exanewton - EN" : force(); break;
                    case "Petanewton - PT" : force(); break;
                    case "Teranewton - TN" : force(); break;
                    case "Giganewton - GN" : force(); break;
                    case "Meganewton - MN" : force(); break;
                    case "Hectonewton - hN" : force(); break;
                    case "Dekanewton - daN" : force(); break;
                    case "Decinewton - dN" : force(); break;
                    case "Centinewton - cN" : force(); break;
                    case "Milinewton - mN" : force(); break;
                    case "Micronewton - μN" : force(); break;
                    case "Nanonewton - nN" : force(); break;
                    case "Piconewton - pN" : force(); break;
                    case "Femtonewton - fN" : force(); break;
                    case "Attonewton - aN" : force(); break;
                    case "Dyne - dyn" : force(); break;
                    case "Joule/meter - J/m" : force(); break;
                    case "Joule/centimeter - J/cm" : force(); break;
                    case "Ton-force(short) - tonf" : force(); break;
                    case "Ton-force(long) - tonf" : force(); break;
                    case "Kip-force - kipf" : force(); break;
                    case "Kilopound-force- kipf" : force(); break;
                    case "Pound-force - lbf" : force(); break;
                    case "Ounce-force - ozf" : force(); break;
                    case "Poundal - pdl(force)" : force(); break;
                    case "Pound foot/square second - lb*ft/sec²" : force(); break;
                    case "Pond - p" : force(); break;
                    case "Kilopond - kp" : force(); break;

                    //time
                    case "Second - s" : time(); break;
                    case "Millisecond - ms" : time(); break;
                    case "Minute - min" : time(); break;
                    case "Hour - h" : time(); break;
                    case "Day - d" : time(); break;
                    case "Week - week" : time(); break;
                    case "Month - month" : time(); break;
                    case "Year - y" : time(); break;
                    case "Decade - decade" : time(); break;
                    case "Century - century" : time(); break;
                    case "Millenium - millenium" : time(); break;
                    case "Microsecond - μs" : time(); break;
                    case "Nanosecond - ns" : time(); break;
                    case "Picosecond - ps" : time(); break;
                    case "Femtosecond - fs" : time(); break;
                    case "Attosecond - as" : time(); break;
                    case "Shake - shake" : time(); break;
                    case "Month(Synodic) - month" : time(); break;
                    case "Year(Julian) - y" : time(); break;
                    case "Year(leap) - y" : time(); break;
                    case "Year(tropical) - y" : time(); break;
                    case "Year(sidereal) - y" : time(); break;
                    case "Day(sidereal) - d" : time(); break;
                    case "Hour(sidereal) - h" : time(); break;
                    case "Minute(sidereal) - min" : time(); break;
                    case "Second(sidereal) - s" : time(); break;
                    case "Fortnight - f" : time(); break;
                    case "Septennial - s" : time(); break;
                    case "Octennial - o" : time(); break;
                    case "Novennial - n" : time(); break;
                    case "Quindecennial - q" : time(); break;
                    case "Quinquennial - q" : time(); break;
                    case "Plank time - pt" : time(); break;

                    //speed
                    case "Meter/second - m/s" : speed(); break;
                    case "Kilometer/hour - km/h" : speed(); break;
                    case "Mile/hour - mi/h" : speed(); break;
                    case "Meter/hour - m/h" : speed(); break;
                    case "Meter/minute - m/min" : speed(); break;
                    case "Kilometer/minute - km/min" : speed(); break;
                    case "Kilometer/second - km/s" : speed(); break;
                    case "Centimeter/hour - cm/h" : speed(); break;
                    case "Centimeter/minute - cm/min" : speed(); break;
                    case "Centimeter/second - cm/s" : speed(); break;
                    case "Millimeter/hour - mm/h" : speed(); break;
                    case "Millimeter/minute - mm/min" : speed(); break;
                    case "Millimeter/second - mm/s" : speed(); break;
                    case "Foot/hour - ft/h" : speed(); break;
                    case "Foot/minute - ft/min" : speed(); break;
                    case "Foot/second - ft/s" : speed(); break;
                    case "Yard/hour - yd/h" : speed(); break;
                    case "Yard/minute - yd/min" : speed(); break;
                    case "Yard/second - yd/s" : speed(); break;
                    case "Mile/minute - mi/min" : speed(); break;
                    case "Mile/second - mi/s" : speed(); break;
                    case "Knot - knots" : speed(); break;
                    case "Knot (UK) - knots(UK)" : speed(); break;
                    case "Velocity of light in vacuum - c" : speed(); break;
                    case "Cosmic velocity - first - hom" : speed(); break;
                    case "Cosmic velocity - second - cosmic" : speed(); break;
                    case "Cosmic velocity - third - cosmic" : speed(); break;
                    case "Earth's velocity - earth" : speed(); break;
                    case "Velocity of sound in pure water - sound" : speed(); break;
                    case "Velocity of sound in sea water - sound" : speed(); break;
                    case "Mach - mach" : speed(); break;
                    case "Mach (SI standard) - mach" : speed(); break;

                    //angle
                    case "Degree - °" : angle(); break;
                    case "Radian - rad" : angle(); break;
                    case "Grad - ^g" : angle(); break;
                    case "Minute - '" : angle(); break;
                    case "Second -  ″ " : angle(); break;
                    case "Gon - gon" : angle(); break;
                    case "Sign - sign" : angle(); break;
                    case "Mil - mil" : angle(); break;
                    case "Revolution - r" : angle(); break;
                    case "Circle - ∅" : angle(); break;
                    case "Turn - turn" : angle(); break;
                    case "Quadrant - 90°" : angle(); break;
                    case "Right angle - 90°" : angle(); break;
                    case "Sextant - 60°" : angle(); break;

                    //fuel
                    case "Meter/liter - m/L" : fuel(); break;
                    case "Exameter/liter - Em/L" : fuel(); break;
                    case "Petameter/liter - Pm/L" : fuel(); break;
                    case "Terameter/liter - Tm/L" : fuel(); break;
                    case "Gigameter/liter - Gm/L" : fuel(); break;
                    case "Megameter/liter - Mm/L" : fuel(); break;
                    case "Kilometer/liter - km/L" : fuel(); break;
                    case "Hectometer/liter - hm/L" : fuel(); break;
                    case "Dekameter/liter - dam/L" : fuel(); break;
                    case "Centimeter/liter - cm/L" : fuel(); break;
                    case "Mile(US)/liter - mi/L" : fuel(); break;
                    case "Nautical mile/liter - n.mile/L" : fuel(); break;
                    case "Nautical mile/gallon(US)  - n.mile/gallon" : fuel(); break;
                    case "Kilometer/gallon - km/gallon" : fuel(); break;
                    case "Meter/gallon(US) - m/gallon" : fuel(); break;
                    case "Meter/gallon(UK) - m/gallon" : fuel(); break;
                    case "Mile/gallon(US) - mi/gallon" : fuel(); break;
                    case "Mile/gallon(UK) - mi/gallon" : fuel(); break;
                    case "Meter/cubic meter - m/m^3" : fuel(); break;
                    case "Meter/cubic centimeter - m/cm^3" : fuel(); break;
                    case "Meter/cubic yard - m/yd^3" : fuel(); break;
                    case "Meter/cubic foot - m/ft^3" : fuel(); break;
                    case "Meter/cubic inch - m/in^3" : fuel(); break;
                    case "Meter/quart(US) - m/q" : fuel(); break;
                    case "Meter/quart(UK) - m/q" : fuel(); break;
                    case "Meter/pint(US) - m/pt" : fuel(); break;
                    case "Meter/pint(UK) - m/pt" : fuel(); break;
                    case "Meter/cup(US) - m/cup" : fuel(); break;
                    case "Meter/cup(UK) - m/cup" : fuel(); break;
                    case "Meter/fluid ounce(US) - m/floz" : fuel(); break;
                    case "Meter/fluid ounce(UK) - m/floz" : fuel(); break;
                    case "Liter/meter - L/m" : fuel(); break;
                    case "Liter/100 km - L/100 km" : fuel(); break;
                    case "Gallon(US)/mile - gallon/mi" : fuel(); break;
                    case "Gallon(US)/100 mile - gallon/100 mi" : fuel(); break;
                    case "Gallon(UK)/mile - gallon/mi" : fuel(); break;
                    case "Gallon(UK)/100 mile - gallon/100 mi" : fuel(); break;

                    //datastorage

                    case "Bit - b" : datastorage(); break;
                    case "Nibble - n" : datastorage(); break;
                    case "Byte - B" : datastorage(); break;
                    case "Character - ch" : datastorage(); break;
                    case "Word - w" : datastorage(); break;
                    case "MAPM-word - w" : datastorage(); break;
                    case "Quadruple-word - w" : datastorage(); break;
                    case "Block - blk" : datastorage(); break;
                    case "Kilobit - kb" : datastorage(); break;
                    case "Kilobyte - kB" : datastorage(); break;
                    case "Kilobyte (10^3 bytes) - kB" : datastorage(); break;
                    case "Megabit - Mb" : datastorage(); break;
                    case "Megabyte - MB" : datastorage(); break;
                    case "Megabyte (10^6 bytes) - MB" : datastorage(); break;
                    case "Gigabit - Gb" : datastorage(); break;
                    case "Gigabyte - GB" : datastorage(); break;
                    case "Gigabyte (10^9 bytes) - GB" : datastorage(); break;
                    case "Terabit - Tb" : datastorage(); break;
                    case "Terabyte - TB" : datastorage(); break;
                    case "Terabyte (10^12 bytes) - TB" : datastorage(); break;
                    case "Petabit - Pb" : datastorage(); break;
                    case "Petabyte - PB" : datastorage(); break;
                    case "Petabyte (10^15 bytes) - PB" : datastorage(); break;
                    case "Exabit - Eb" : datastorage(); break;
                    case "Exabyte - EB" : datastorage(); break;
                    case "Exabyte (10^18 bytes) - EB" : datastorage(); break;
                    case "Floppy disk (3.5″, DD) - floppy" : datastorage(); break;
                    case "Floppy disk (3.5″, HD) - floppy" : datastorage(); break;
                    case "Floppy disk (3.5″, ED) - floppy" : datastorage(); break;
                    case "Floppy disk (5.25″, DD) - floppy" : datastorage(); break;
                    case "Floppy disk (5.25″, HD) - floppy" : datastorage(); break;
                    case "Zip 100 - Zip" : datastorage(); break;
                    case "Zip 250 - Zip" : datastorage(); break;
                    case "Jaz 1GB - Jaz" : datastorage(); break;
                    case "Jaz 2GB - Jaz" : datastorage(); break;
                    case "CD (74 minute) - CD" : datastorage(); break;
                    case "CD (80 minute) - CD" : datastorage(); break;
                    case "DVD (1 layer, 1 side) - DVD" : datastorage(); break;
                    case "DVD (2 layer, 1 side) - DVD" : datastorage(); break;
                    case "DVD (1 layer, 2 side) - DVD" : datastorage(); break;
                    case "DVD (2 layer, 2 side) - DVD" : datastorage(); break;

                    //volumedry
                    case "Liter(volume) - L" : volumedry(); break;
                    case "Barrel dry(US) - bbl dry" : volumedry(); break;
                    case "Pint dry(US) - pt dry" : volumedry(); break;
                    case "Quart dry(US) - qt dry" : volumedry(); break;
                    case "Peck dry(US) - pk" : volumedry(); break;
                    case "Peck dry(UK) - pk" : volumedry(); break;
                    case "Bushel(US) - bu" : volumedry(); break;
                    case "Bushel(UK) - bu" : volumedry(); break;
                    case "Cor(Biblical volume) - cor" : volumedry(); break;
                    case "Homer(Biblical volume) - homer" : volumedry(); break;
                    case "Ephah(Biblical) - ephah" : volumedry(); break;
                    case "Seah(Biblical volume) - seah" : volumedry(); break;
                    case "Omer(Biblical volume) - omer" : volumedry(); break;
                    case "Cab(Biblical volume) - cab" : volumedry(); break;
                    case "Log(Biblical volume) - log" : volumedry(); break;

                    default: other();

                }
            }
        });
    }
    private  void other()
    {
        switch(selectedItem) {
            //cooking
            case "Cup(Euro) - cup":
                cooking();
                break;
            case "Cup(US) - cup":
                cooking();
                break;
            case "Gram(cooking) - g":
                cooking();
                break;
            case "Kilogram - kg":
                cooking();
                break;
            case "Liter - li":
                cooking();
                break;
            case "Milliliter - ml":
                cooking();
                break;
            case "Ounce(cooking) - oz":
                cooking();
                break;
            case "Fluid Ounce - floz":
                cooking();
                break;
            case "Pint - pt":
                cooking();
                break;
            case "Pound - lb":
                cooking();
                break;
            case "Table Spoon(Euro) - tbsp":
                cooking();
                break;
            case "Table Spoon(US) - tbsp":
                cooking();
                break;
            case "Tea Spoon(Euro) - tsp":
                cooking();
                break;
            case "Tea Spoon(US) - tsp":
                cooking();
                break;

            //data transfer
            case "Bit/second - b/s":
                datatransfer();
                break;
            case "Byte/second - B/s":
                datatransfer();
                break;
            case "Kilobit/second(SI def.)":
                datatransfer();
                break;
            case "Kilobyte/second(SI def.)":
                datatransfer();
                break;
            case "Kilobit/second - kb/s":
                datatransfer();
                break;
            case "Kilobyte/second - kB/s":
                datatransfer();
                break;
            case "Megabit/second(SI def.)":
                datatransfer();
                break;
            case "Megabyte/second(SI def.)":
                datatransfer();
                break;
            case "Megabit/second - Mb/s":
                datatransfer();
                break;
            case "Megabyte/second - MB/s":
                datatransfer();
                break;
            case "Gigabit/second(SI def.)":
                datatransfer();
                break;
            case "Gigabyte/second(SI def.)":
                datatransfer();
                break;
            case "Gigabit/second - Gb/s":
                datatransfer();
                break;
            case "Gigabyte/second - GB/s":
                datatransfer();
                break;
            case "Terabit/second(SI def.)":
                datatransfer();
                break;
            case "Terabyte/second(SI def.)":
                datatransfer();
                break;
            case "Terabit/second - Tb/s":
                datatransfer();
                break;
            case "Terabyte/second - TB/S":
                datatransfer();
                break;
            case "Ethernet":
                datatransfer();
                break;
            case "Ethernet(fast)":
                datatransfer();
                break;
            case "Ethernet(gigabit)":
                datatransfer();
                break;
            case "OC1":
                datatransfer();
                break;
            case "OC3":
                datatransfer();
                break;
            case "OC12":
                datatransfer();
                break;
            case "OC24":
                datatransfer();
                break;
            case "OC48":
                datatransfer();
                break;
            case "OC192":
                datatransfer();
                break;
            case "OC768":
                datatransfer();
                break;
            case "ISDN (single channel)":
                datatransfer();
                break;
            case "ISDN(dual channel)":
                datatransfer();
                break;
            case "Modem(110)":
                datatransfer();
                break;
            case "Modem(300)":
                datatransfer();
                break;
            case "Modem(1200)":
                datatransfer();
                break;
            case "Modem(2400)":
                datatransfer();
                break;
            case "Modem(9600)":
                datatransfer();
                break;
            case "Modem(14.4k)":
                datatransfer();
                break;
            case "Modem(28.8k)":
                datatransfer();
                break;
            case "Modem(33.6k)":
                datatransfer();
                break;
            case "Modem(56k)":
                datatransfer();
                break;
            case "SCSI(Async)":
                datatransfer();
                break;
            case "SCSI(Sync)":
                datatransfer();
                break;
            case "SCSI(Fast)":
                datatransfer();
                break;
            case "SCSI(Fast Ultra)":
                datatransfer();
                break;
            case "SCSI(Fast Wide)":
                datatransfer();
                break;
            case "SCSI(Fast Ultra Wide)":
                datatransfer();
                break;
            case "SCSI(Ultra-2)":
                datatransfer();
                break;
            case "SCSI(Ultra-3)":
                datatransfer();
                break;
            case "SCSI(LVD Ultra 80)":
                datatransfer();
                break;
            case "SCSI(LVD Ultra 160)":
                datatransfer();
                break;
            case "IDE(PIO mode 0)":
                datatransfer();
                break;
            case "IDE(PIO mode 1)":
                datatransfer();
                break;
            case "IDE(PIO mode 2)":
                datatransfer();
                break;
            case "IDE(PIO mode 3)":
                datatransfer();
                break;
            case "IDE(PIO mode 4)":
                datatransfer();
                break;
            case "IDE(DMA mode 0)":
                datatransfer();
                break;
            case "IDE(DMA mode 1)":
                datatransfer();
                break;
            case "IDE(DMA mode 2)":
                datatransfer();
                break;
            case "IDE(UDMA mode 0)":
                datatransfer();
                break;
            case "IDE(UDMAmode 1)":
                datatransfer();
                break;
            case "IDE(UDMA mode 2)":
                datatransfer();
                break;
            case "IDE(UDMA mode 3)":
                datatransfer();
                break;
            case "IDE(UDMA mode 4)":
                datatransfer();
                break;
            case "IDE(UDMA 33)":
                datatransfer();
                break;
            case "IDE(UDMA 66)":
                datatransfer();
                break;
            case "USB":
                datatransfer();
                break;
            case "Firewire(IEEE-1394)":
                datatransfer();
                break;
            case "T0(payload)":
                datatransfer();
                break;
            case "T0(B8ZS payload)":
                datatransfer();
                break;
            case "T1(signal)":
                datatransfer();
                break;
            case "T1(payload)":
                datatransfer();
                break;
            case "T1Z(payload)":
                datatransfer();
                break;
            case "T1C(signal)":
                datatransfer();
                break;
            case "T1C(payload)":
                datatransfer();
                break;
            case "T2(signal)":
                datatransfer();
                break;
            case "T3(signal)":
                datatransfer();
                break;
            case "T3(payload)":
                datatransfer();
                break;
            case "T3Z(payload)":
                datatransfer();
                break;
            case "T4(signal)":
                datatransfer();
                break;
            case "E.P.T.A.1(signal)":
                datatransfer();
                break;
            case "E.P.T.A.1(payload)":
                datatransfer();
                break;
            case "E.P.T.A.2(signal)":
                datatransfer();
                break;
            case "E.P.T.A.2(payload)":
                datatransfer();
                break;
            case "E.P.T.A.3(signal)":
                datatransfer();
                break;
            case "E.P.T.A.3(payload)":
                datatransfer();
                break;
            case "H0":
                datatransfer();
                break;
            case "H11":
                datatransfer();
                break;
            case "Virtual Tributary 1(signal)":
                datatransfer();
                break;
            case "Virtual Tributary 1(payload)":
                datatransfer();
                break;
            case "Virtual Tributary 2(signal)":
                datatransfer();
                break;
            case "Virtual Tributary 2(payload)":
                datatransfer();
                break;
            case "Virtual Tributary 6(signal)":
                datatransfer();
                break;
            case "Virtual Tributary 6(payload)":
                datatransfer();
                break;
            case "STS1(signal)":
                datatransfer();
                break;
            case "STS1(payload)":
                datatransfer();
                break;
            case "STS3(signal)":
                datatransfer();
                break;
            case "STS3(payload)":
                datatransfer();
                break;
            case "STS3c(signal)":
                datatransfer();
                break;
            case "STS3c(payload)":
                datatransfer();
                break;
            case "STS12(signal)":
                datatransfer();
                break;
            case "STS24(signal)":
                datatransfer();
                break;
            case "STS48(signal)":
                datatransfer();
                break;
            case "STS192(signal)":
                datatransfer();
                break;
            case "STM-1(signal)":
                datatransfer();
                break;
            case "STM-4(signal)":
                datatransfer();
                break;
            case "STM-16(signal)":
                datatransfer();
                break;
            case "STM-64(signal)":
                datatransfer();
                break;


            //image actiivyt
            case "Twip - twip":
                imageactivity();
                break;
            case "Meter - m":
                imageactivity();
                break;
            case "Centimeter - cm":
                imageactivity();
                break;
            case "Millimeter - mm":
                imageactivity();
                break;
            case "Inch - in":
                imageactivity();
                break;
            case "Pixel(X) - pixel(x)":
                imageactivity();
                break;
            case "Pixel(Y) - pixel(y)":
                imageactivity();
                break;
            case "Character(X) - character(x)":
                imageactivity();
                break;
            case "Character(Y) - character(y)":
                imageactivity();
                break;
            case "Pica - P":
                imageactivity();
                break;
            case "Point - pt":
                imageactivity();
                break;
            case "En - en":
                imageactivity();
                break;

           //prefix
            case "None - none":
                prefix();
                break;
            case "Yotta - Y":
                prefix();
                break;
            case "Zetta - Z":
                prefix();
                break;
            case "Exa - E":
                prefix();
                break;
            case "Peta - P":
                prefix();
                break;
            case "Tera - T":
                prefix();
                break;
            case "Giga - G":
                prefix();
                break;
            case "Mega - M":
                prefix();
                break;
            case "Kilo - k":
                prefix();
                break;
            case "Hecto - h":
                prefix();
                break;
            case "Deka - da":
                prefix();
                break;
            case "Deci - d":
                prefix();
                break;
            case "Centi - c":
                prefix();
                break;
            case "Milli - m":
                prefix();
                break;
            case "Micro - µ":
                prefix();
                break;
            case "Nano - n":
                prefix();
                break;
            case "Pico - p":
                prefix();
                break;
            case "Femto - f":
                prefix();
                break;
            case "Atto - a":
                prefix();
                break;
            case "Zepto - z":
                prefix();
                break;
            case "Yocto - y":
                prefix();
                break;

            //sound
            case "Bel - B":
                sound();
                break;
            case "Decible - dB":
                sound();
                break;
            case "Neper - Np":
                sound();
                break;

            //typographic
            case "Twip(typography) - twip":
                typography();
                break;
            case "Meter(typography) - m":
                typography();
                break;
            case "Centimeter(typography) - cm":
                typography();
                break;
            case "Millimeter(typography) - mm":
                typography();
                break;
            case "Character(X)(typography) - character(x)":
                typography();
                break;
            case "Character(Y)(typography) - character(y)":
                typography();
                break;
            case "Pixel(X)(typography) - pixel(x)":
                typography();
                break;
            case "Pixel(Y)(typography) - pixel(y)":
                typography();
                break;
            case "Inch(typography) - in":
                typography();
                break;
            case "Pica(Computer) - pica":
                typography();
                break;
            case "Pica(Printer) - pica":
                typography();
                break;
            case "PostScript point - psp":
                typography();
                break;
            case "Point(Computer) - pt":
                typography();
                break;
            case "Point(Printer) - pt":
                typography();
                break;
            case "En(typography) - en":
                typography();
                break;

            //voulmelumber
            case "Cubic meter - m³":
                volumelumber();
                break;
            case "Cubic foot - ft³":
                volumelumber();
                break;
            case "Cubic inch - in³":
                volumelumber();
                break;
            case "Board feet - boardfeet":
                volumelumber();
                break;
            case "Thousand board feet - thousand board feet":
                volumelumber();
                break;
            case "Cord - cord":
                volumelumber();
                break;
            case "Cord(80 cubic ft) - cord":
                volumelumber();
                break;
            case "Cord feet - cordfeet":
                volumelumber();
                break;
            case "Cunit - cunit":
                volumelumber();
                break;
            case "Pallet - pallet":
                volumelumber();
                break;
            case "Cross tie - crosstie":
                volumelumber();
                break;
            case "Switch tie - switchtie":
                volumelumber();
                break;
            case "Thousand square feet (1/8inch panels) - ft²":
                volumelumber();
                break;
            case "Thousand square feet (1/4inch panels) - ft²":
                volumelumber();
                break;
            case "Thousand square feet (3/8inch panels) - ft²":
                volumelumber();
                break;
            case "Thousand square feet (1/2inch panels) - ft²":
                volumelumber();
                break;
            case "Thousand square feet (3/4inch panels) - ft²":
                volumelumber();
                break;

            //work
            case "Joule(work) - J":
                work();
                break;
            case "Kilojoule - kJ":
                work();
                break;
            case "Calorie - cal":
                work();
                break;
            case "Kilocalorie - kcal":
                work();
                break;
            case "Kilowatt hour - kw*h":
                work();
                break;
            case "Kilogram force meter - kgf*m":
                work();
                break;
            case "Inch pound - in*lbf":
                work();
                break;
            case "Foot pound - ft*lbf":
                work();
                break;
            case "Btu - btu":
                work();
                break;
        }
    }
    private void work() {
        Intent i7=new Intent(SearchActivity.this,WorkConverterActivity.class);
        startActivity(i7);
    }
    private void volumelumber() {
        Intent i7=new Intent(SearchActivity.this,VolumeLumberConverterActivity.class);
        startActivity(i7);
    }
    private void typography() {
        Intent i7=new Intent(SearchActivity.this,TypographyConversionActivity.class);
        startActivity(i7);
    }
    private void sound() {
        Intent i7=new Intent(SearchActivity.this,SoundActivity.class);
        startActivity(i7);
    }
    private void prefix() {
        Intent i7=new Intent(SearchActivity.this,PrefixActivity.class);
        startActivity(i7);
    }

    private void imageactivity() {
        Intent i7=new Intent(SearchActivity.this,ImageActivity.class);
        startActivity(i7);
    }

    private void datatransfer() {
        Intent i7=new Intent(SearchActivity.this,DataTransferConverterActivity.class);
        startActivity(i7);
    }
    private void cooking() {
        Intent i7=new Intent(SearchActivity.this,CookingActivity.class);
        startActivity(i7);
    }

    private void volumedry() {
        Intent i7=new Intent(SearchActivity.this, VolumeDryActivity.class);
        startActivity(i7);
    }

    private void datastorage() {
        Intent i7=new Intent(SearchActivity.this, DataStorageActivity.class);
        startActivity(i7);
    }

    private void fuel() {
        Intent i7=new Intent(SearchActivity.this, FuelActivity.class);
        startActivity(i7);
    }

    private void angle() {
        Intent i7=new Intent(SearchActivity.this, AngleActivity.class);
        startActivity(i7);
    }

    private void speed() {
        Intent i7=new Intent(SearchActivity.this, SpeedActivity.class);
        startActivity(i7);
    }

    private void time() {
        Intent i7=new Intent(SearchActivity.this, TimeActivity.class);
        startActivity(i7);
    }

    private void force() {
        Intent i7=new Intent(SearchActivity.this, ForceActivity.class);
        startActivity(i7);
    }

    private void power() {
        Intent i7=new Intent(SearchActivity.this, PowerActivity.class);
        startActivity(i7);
    }

    private void energy() {
        Intent i7=new Intent(SearchActivity.this, EnergyActivity.class);
        startActivity(i7);
    }

    private void pressure() {
        Intent i7=new Intent(SearchActivity.this, PressureActivity.class);
        startActivity(i7);
    }

    private void area() {
        Intent i7=new Intent(SearchActivity.this, AreaActivity.class);
        startActivity(i7);
    }

    private void volume() {
        Intent i7=new Intent(SearchActivity.this, VolumeActivity.class);
        startActivity(i7);
    }

    private void weight() {
        Intent i7=new Intent(SearchActivity.this, WeightActivity.class);
        startActivity(i7);
    }

    private void temperture() {
        Intent i7=new Intent(SearchActivity.this, TempertureActivity.class);
        startActivity(i7);
    }

    private void length() {
        Intent i=new Intent(SearchActivity.this, LengthActivity.class);
        startActivity(i);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        SearchActivity.this.adapter.getFilter().filter(s);

    }

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {

            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                this.finish();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }



}



