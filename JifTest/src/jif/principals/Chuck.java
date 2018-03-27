package jif.principals;

public class Chuck extends jif.lang.ExternalPrincipal {
    public Chuck jif$principals$Chuck$() {
        this.jif$init();
        { this.jif$lang$ExternalPrincipal$("Chuck"); }
        return this;
    }
    
    private static Chuck P;
    
    public static jif.lang.Principal getInstance() {
        if (Chuck.P == null) { Chuck.P = new Chuck().jif$principals$Chuck$(); }
        return Chuck.P;
    }
    
    public static final String jlc$CompilerVersion$jif = "3.5.0";
    public static final long jlc$SourceLastModified$jif = 1521789288000L;
    public static final String jlc$ClassType$jif =
      ("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" +
       "fLslz9qCkRZg8v0PYd20uUUZAAA=");
    
    public Chuck() { super(); }
    
    public void jif$invokeDefConstructor() { this.jif$principals$Chuck$(); }
    
    private void jif$init() {  }
    
    public static final String jlc$CompilerVersion$jl = "2.7.1";
    public static final long jlc$SourceLastModified$jl = 1521789288000L;
    public static final String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK05W8zj2Fme2dnZa/fWbi/b7Xa6nS7dpjt2EidOWAq1HTuJ" +
       "L4njxHHiqt36Gju+28eOnbJQEHSXViwItqUI2qcitdXSSkgVD6hVX4BWrZBA" +
       "iMsDtA9IgEof+gC8AMXOf51/Zqc8EOlccs53vvPdzzmfX/shdHeaQNei0Cs3" +
       "XghugDIy0xuCmqSmQXpqmi6qgRf0TzfgV3/nI4/80V3Qwwr0sBPMgQocnQwD" +
       "YBZAgR70TV8zkxQ3DNNQoEcD0zTmZuKonrOvAMNAgR5LnU2ggiwxU9FMQy+v" +
       "AR9Ls8hMDnueDHLQg3oYpCDJdBAmKYAe4bZqrsIZcDyYc1LwPAddtRzTM9IY" +
       "+gXoEgfdbXnqpgJ8M3fCBXzACNP1eAV+v1ORmViqbp4sueI6gQGgd15cccrx" +
       "dbYCqJbe45vADk+3uhKo1QD02BFJnhps4DlInGBTgd4dZtUuAHridZFWQPdG" +
       "qu6qG/MFAL31IpxwNFVB3XcQS70EQI9fBDtgKhLoiQs6O6etH05+5pWPBaPg" +
       "8oFmw9S9mv67q0VPXVgkmpaZmIFuHi188H3cZ9Q3f/3lyxBUAT9+AfgI5o9/" +
       "/kcffP9T3/zWEczbbwMz1bamDl7Qv6A99JdPks/276rJuDcKU6c2hZs4P2hV" +
       "OJ55vogqW3zzKcZ68sbJ5DfFP1t//MvmDy5D94+hq3roZX5lVY/qoR85npkM" +
       "zcBMVGAaY+g+MzDIw/wYuqfqc05gHo1OLSs1wRi64h2GroaH/5WIrApFLaIr" +
       "Vd8JrPCkH6nAPvSLCIKge6oCPVaVu6rSOG6vAYiGpbQyfhgvTA+uhO1Eqfnc" +
       "LkzctNK2CTOOtTBTAKeJ/tzWseC6RJXR6E6kepV52Jnu3qgGo/83TEVN8xt2" +
       "ly5V4nzyomt7FaZR6Blm8oL+akZQP/rKC9+5fGrcx9wC6E0VnhtnyG8ckEOX" +
       "Lh2Qvqm2/yP9VNJ1K6+tHPPBZ+cfZj768tOVVIpod6WSTQ16/aKZnjn3uOqp" +
       "le29oD/80r/8x1c/82J4ZrAAun6LH926svaDpy8ymIS6aVRx5gz9+66pX3vh" +
       "6y9ev1wr9b4qvAC1MoDKV5+6uMdN/vD8SWyphXKZgx6wwsRXvXrqJCDcD+wk" +
       "3J2NHCT/wKH/0I+r36Wq/E9datOpB+q2CiDksdleO7XbKDrSWi3dCxwd4tgH" +
       "5tHn/u4v/rV9uabkJOQ9fC42zk3w/Dk3q5E9eHCoR8+UtUhMs4L7h88Kv/3p" +
       "H770oYOmKoh3327D63Vd06lW9IXJr34r/vvv/eMX/vrymXYBdDXKNM/RD5Q/" +
       "WSF65myrygO9KgpUlKTXpcAPDcdyVM0za0v5r4ff0/zav73yyJG6vWrkSHgJ" +
       "9P6fjOBs/G0E9PHvfOQ/nzqguaTXJ8CZOM7AjsLKG88w40miljUdxS/91Tt+" +
       "98/Vz1UBqgoKqbM3D34OHdiDDlw1Drp85lC/78Lcc3X19uIw9/hh/Ep6a4il" +
       "67PqzBYV+LXff4L82R8ciD6zxRrHE8Wt7rpUz7lJ68v+v19++uqfXobuUaBH" +
       "DsekGoCl6mW1VpXqoEvJ40EOesNN8zcfWkcR+vlTX3vyoh+c2/aiF5yFiapf" +
       "Q9f9e84bfiWIN9ZCeldV7q3KZ47bl+vZR6K6frS4BB067cOSpw71u+rq+kGQ" +
       "lwF0TxV88sozKitLD7eN4hT7lZNAXGN96bgtz2EH0CXh4E1HLlXX8MFGi0uV" +
       "1d7dvtG5gdT/n7/97nfV3ffUVa+CtpxA9Y5MHEBv2Xr69RPvXVaxujKw61Wo" +
       "PKB4rLqtHMysFvKNo5vBbSiojOShMzAurK4Pn/qn3/zub7z7e5VRMNDdea2w" +
       "yhbO4Zpk9f3qE699+h0PvPr9Tx18sHJAbfa1b3ywxkrW1Qequ0dN3TzMEt3k" +
       "1BTwB6cxjQOBt1qmkDh+FSvy48PffPnVT/74xiuvXj53Q3r3LZeU82uObkkH" +
       "0dx/xFy1y7vutMthBf3PX33xT7744ktHN4jHbj7vqSDz//Bv/vu7Nz77/W/f" +
       "5li64oW3lSl46P0jNB3jJz8WWVsrQipW7XxOdjuUINBLlJzZxGDWY6iFs8VV" +
       "luitZiEbrJjJplx4uzzZa/MmVmJJe2S2c4ZR5tNpLMymsbIgeFEcMi1iHIlk" +
       "q+tvtRmlqE4qV30gdRGjyfW6hlO2+Mmk5dMa0NqW1W+2Qqu92WttI+/DFoaZ" +
       "fczCsiDp0s4MsfZ2LCJsESzSybArSsmIMNp4rG3iLbwilzTba+isFuuTfmtj" +
       "EDQVb6Q0WEe2TQ5TYybzzny2lFclYRNLjbLX0nysjF1XbLHzmRE5KhuH7EYT" +
       "Ccm1CwdDFuJ8HM5DRtnM6TnOEfGsY+xFHBG6GiFupuXcGaNiyaohninkkPeo" +
       "EGY3PoVX7Gpg7UhqEnbHsbxbeMRgQGzaoSzbo14mZpwrhzCs6tsoBryj9YKR" +
       "PRxKWVunPHc2EbDuvtsTRcmXyKULmAFBsoy0lOwd1SM92dhFNpwUoSKRsT6P" +
       "6YSYTuSBIfmzaEXhS0ai4u3QxSVpI4tIJUZ71hEpVh5O3IlMipjvTQoP7ywR" +
       "T2bYKHPECTtv2lPZarAINt6tCRxBmhRHdxuDfchnpUsaMtXjxokyc8K1VxHS" +
       "RPXpTpHLBr3DcTCfD3ZLrLV0ZRYnpqHtgSkdzYk5DouMLOGzcb7kWIoNtnyE" +
       "LJSYpCid3ig7NyZUoVnq3I6WfNInQxtHdjt4yI6Hy07upB2OE4CVrxbTQp5G" +
       "0gbd+7SoBOVqF437i66rRfvh1FOoPTHi6J4+JReCgO1Sh+DxvcXjeidb5iu6" +
       "AQMBc5QZuge7Ad/MUZtjWNdkSxiNW12Vzw0J23BxqFBbsyEGAw9u00VUttyZ" +
       "PJiA6sVWNJdxryW0kjw0BHTdGMTsjrMlcbn3NXzbjeiJOmF4sG6vd6tkQs27" +
       "ErFJ4rmtYcjY48cdhszUvdyfRHiHz5bkfB8rAxYOpyzikmQcb6giYufLuFUw" +
       "EUFM0k5EstS8QeMTixY2cotrbWdiU+TWCjrtioOFP2Y8shURHtpSnXhQgMpa" +
       "S6I/IbmBOC6MEaVsF+2uauJIGM8YPtmO1vRa18Ilg0nZ1mP53hJFhng8mE6D" +
       "3q5EyEjqSDbKCM7G3A8XhiUwbI/STL0VzZfhNG3mg5yWRXtH4+E+NKYJ3B50" +
       "N215OJZ6ttWZI/0ptu4BtscAhluIIcAnxRwpFT4IEXRnYMMeEzIjWB4afTCg" +
       "VithRdB0geesgayxxcxb+z3THk5UgK8iO1u0l9s54Vb2OKPdlsww27G+8TUv" +
       "Wvhme0NMDNSeAS7YFHq7IZMJpWQrcwt3mn2Am821G2+iZL/ZIpa7UxK332Mz" +
       "J3Fodgbb8N4Rs6HXEdz+XqIlgnBxheQ3QwkJ+xbaF6iRpjhLnHXTwmEMub/e" +
       "bZCyMtvKqiXaGAVi4I/sZbrCm7Lvx53JYqnssgLrTkNkq2mLbAHEFM7cNe61" +
       "tHW/1Zm0LTiXkpkoInow9LqtfbJTFxPaakgyKXP9YTJy2lFzi4+ybjZCpZ2Z" +
       "Y6vWLBMJnCMdZL2YgLAYtHWeJXy7geVTIIywAsamrQ3aXlPbpJ/mZclMl2A8" +
       "rWLOnhq2W7qhz1Imc4qiMR7BY5ef4it10vE7jCg1GZXKI28htHt5R+I8DEYA" +
       "6sbYRi/3IxJUoTmCS2uz52HTIbqNNBes/rrgZ+wi8Lr8nkB3QSG7086s1eXC" +
       "QhQCVoBHmMl3e5xYkv2ZG+6j0YhPbdGZugNeHellQzF3k4zRZGSoiRs7gEsm" +
       "nfR1RrbXPQlnxvmgM3a2k3xCycg2Xwu+1uZ2FLyQBGU8tmeIsXILGluuVHMg" +
       "rttbHI+6K6K/97jJdOabq2BnlLBKGduuq2wRlE8Xseqn5Ch2/XWHdhaAdwVW" +
       "HbDhsGusTaoifTID4aCL9QFFF8rATqZ4FCo60NIomm6bHXE3N1prL1KkYXV+" +
       "BRMxKuUl5RV9cYIZqxUBmjq9kJYVO0pjsIm7NN+fb5VkzdJ51BGxuAjLIVBb" +
       "28XQSqKR7RZACNSkC1s7Hl7aWW84CmZqo8sLUUdvqIJF8E3cN5dCybRIfrYh" +
       "+irWW2TcpqmvmgEbJii/bwaYBBv5YMaWjbwz8LERX1hARvuzaG01BQCQMUJP" +
       "Bw7qKpyzVYUcNbuYFmDkrNkzltaOjoJmY8bQ0da3Qbzl4+UAiCgbtvZ9j+/F" +
       "mWkJWAosa9tt+lTGFyyLOr0x0JBhxyDUSW4Lazq1vAhb6k2fnQdZIPgYs1oF" +
       "jQTzlgkq7GZSX7fYjpv08txye1QftJKN1OhgY1HLvA3gWlqvl5Yub6WaoxnN" +
       "qNdEG4nmIXpXaIzSRtJKKF7t0gafW/QMM/fWnkbbIDcC3VtpbTWUeXglo9F+" +
       "O9T8crJaxc1IyFecz+9JdMyKtrsBpQFaBTKwcGTMlaW7R5F4LCfDyJCbZB/V" +
       "1DxHEqW/XhvLSO2uaLaLC0jZ9FVhJCgI3GuYQ0CHyJrGVhojh3nQTJgFqgmo" +
       "aOLYXuhKaiOgsPlovO3HXqRODL8VqQuvJQ+LoNL4Ouuh1mQlluNWuzvEU2yE" +
       "Y12B2En+OMRUoTXdWlE6bCyFnobJSaLFwmQpExjiT0V5OOWwFgencGsnLYto" +
       "RsX2RtqSKL3wxS6LCtwIaQv9bYOMPUQs8rGZLCau0Wu7FUfoxAXUYttrM3Cy" +
       "3DaD3TST+ELGxh3F9AY7J5v7OR3rO3iDtOzVThFJcU4lfDkYwvhgE5WeKI1J" +
       "LhCHTaasLrxpr9vHuKHWYMAk8OSoBXsjBnTLhhuMxuvCnqvbFPSAwSNqLnR6" +
       "zIo0etu0j3lJtCMcHJXtCUe3xnI7Ww/WXMWIYsyCkmjjJg82/ZZnIk3Glvqd" +
       "pO+P0+5sPUTRhRu3JJ+Q4DI28j2NtCy1dHumUlKaAtYDueD2Mll6w4kCc8AG" +
       "q3QU7+cti3Xm6ylabBJtPdtFk4yoDmBLHc2GsqVjo5GjDHawwRULXcnElrKQ" +
       "BWZKwPIaRuf9YNRYER1eVtcIA0cFKTM7G+RcRGbtVhsnukm4DAYjmeW5/UJU" +
       "qqN9mzfJDpDLnVkEWQ9ITB9TyEUzTz0d74dMgU2ogdicaNsSDghEri6dan+u" +
       "e76VD0aLfj8VquvqcCdlm+HQqR4WrlCd3isUK/JgbxRFZxxMbAOWGEyvJLQS" +
       "J1bbX02NiUH2sfUwgMWG4mKmAceT/TqnYGVQYEQ56ze2W1FO9mKAKm1staJg" +
       "uAmSZqiznIbO8oHRG6ULODYSOZ6jrDWgQbjOIyefOH5fFTShsW1tdCqAMbIt" +
       "b8HAH1P0gtiThTKU8TGsycxyze9xqdWM7D7ZLPCB7G18dchhXIvoLFdYb7Cy" +
       "OLPLVKFVGREBGc/sfiKTOKs5TsoPQboSpptFOHC3VpObJa43GIY7vE377TiE" +
       "AVVKTTmXdW0837etBsJGnZ247TLzhYJgbtSprKI7N6elA6L5epDvB9gSbpv6" +
       "RF3NbFt2dl4/FQkZNeb7aEJkXqkwgpHblsfx7YAI46Wp9XsctypXNI/oybw6" +
       "FNvWepo19wqHGvaU3M/lpdcKUCfTpe1CX0ZOGq46DdUpsFinlivbcmebWIfR" +
       "HeZhdjjVx/6G3Rgj20w7hb3NEN5vM7NVGZPaANCDwF2gptiweh4mAJb3TDnv" +
       "UEExKjMZNBtoPrWbKdpteWtmHzFyP2iCqNDXqNlecLCW5UljXJ0RVEg2hK3B" +
       "TOYlrfXa+rK3NkYiTPmRrIlkMG/DsWXbJjsKRl6wndsbs7vcdfJylO8ysbGT" +
       "GuyutRWoLgySlUv5VLlJhwuk6/kDhLOQdOgYA4Am9Ki1TotGNJxNk72UtEm/" +
       "aGdwv4EaCb9a7UZ2hClDJ+9YXOrt+zHpisqmlyPC2mghmSQp1evwA/WzcXr8" +
       "aH708KQ/zfxXb+V6Aj88Mo9yDk/V1dOn6YfD7+px/vedx+3bzqUfzmWEoPpJ" +
       "/I7XS9UfnsNf+OVXP29M/6B5+TitxAHoPhBGz3lmbnoXkkvvvICJP3yeOMsQ" +
       "fYl/7dvDZ/TfugzddZrcueUrx82Lnr85pXN/YoIsCRY3JXbedsr7Ayepl5oi" +
       "5bidn0/snD3OL4jtII77jzvicctdFNvtU20fvcOcVlcfAtDjleaun2Wsrx8y" +
       "1tfPyFmfUlLTD/1UVe6ryjeO2y+9DhO3pKbOkkMXMlKPHmP64nH7e/833rZ3" +
       "mDt8uDEA9MDGBCcKO0k1PVZn6A/ZIeGU6Zv5PHyweKZO1R4b7aWj9LN1a/r5" +
       "p6/FmZo6cRYC871HWd1reegY12qhOkEeuubAtM6l4N/77LWPAdtJb9xW6u99" +
       "9vkXnz1Nad/Jh24irZ5NougOAsnvMHeoIgC99fVoPqwaHWeq6oYF0JWaywty" +
       "u/dEmxfk9nM/SW5HGcvzgnNALahrH/rw/NpFgVw0rEt1FytuFtE9txPRL95R" +
       "RL9yh7lP1NWLALr3hLr6/74A0N0HvdWJ8rfe8i346Iul/pXPP3zvWz4v/e3h" +
       "K8rpV8WrHHSvlXne+azwuf7VKDEt57D31aMc8ZEMPgmgh27+wgSg+8/+HIj/" +
       "tSPQXwfQXcdB+ZXoxPifODV+qgBmEqjeqRMU/wsUC5ly1R4AAA==");
}
