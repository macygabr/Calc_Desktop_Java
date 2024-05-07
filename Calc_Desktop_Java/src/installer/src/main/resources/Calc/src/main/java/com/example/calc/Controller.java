package com.example.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;
import java.io.*;

import com.example.calc.NativeLib;

public class Controller {
    private NativeLib nativeLib;
    private static ListView listViewCopy;
    private static String pathToJar;

    @FXML
    private TextField TextField;

    @FXML
    private Label layerMenu1;

    @FXML
    private LineChart<Number, Number> LineChart;

    @FXML
    private Label layerMenu;

    @FXML
    private ListView listViewHistory;

    @FXML
    private TextField MaxTextField;

    @FXML
    private TextField MinTextField;

    private String func[] = {"arcsin", "arccos", "arctan", "ln", "log", "sin", "cos", "tan", "ctg", "sqrt"};

    @FXML
    protected void ZeroButtonClick() {
        layerMenu.setText(layerMenu.getText() + "0");
    }

    @FXML
    protected void OneButtonClick() {
        layerMenu.setText(layerMenu.getText() + "1");
    }

    @FXML
    protected void TwoButtonClick() {
        layerMenu.setText(layerMenu.getText() + "2");
    }

    @FXML
    protected void ThreeButtonClick() {
        layerMenu.setText(layerMenu.getText() + "3");
    }

    @FXML
    protected void FourButtonClick() {
        layerMenu.setText(layerMenu.getText() + "4");
    }

    @FXML
    protected void FiveButtonClick() {
        layerMenu.setText(layerMenu.getText() + "5");
    }

    @FXML
    protected void SixButtonClick() {
        layerMenu.setText(layerMenu.getText() + "6");
    }

    @FXML
    protected void SevenButtonClick() {
        layerMenu.setText(layerMenu.getText() + "7");
    }

    @FXML
    protected void EightButtonClick() {
        layerMenu.setText(layerMenu.getText() + "8");
    }

    @FXML
    protected void NineButtonClick() {
        layerMenu.setText(layerMenu.getText() + "9");
    }


    @FXML
    protected void dotButtonClick() {
        layerMenu.setText(layerMenu.getText() + ".");
    }

    @FXML
    protected void ACButtonClick() {
        layerMenu.setText("");
    }

    @FXML
    protected void DelButtonClick() {
        if (layerMenu.getText().length() > 0) {
            for (int i = 0; i < func.length; i++) {
                if (layerMenu.getText().length() > func[i].length() && layerMenu.getText().substring(layerMenu.getText().length() - func[i].length() - 1, layerMenu.getText().length()).equals(func[i] + "(")) {
                    layerMenu.setText(layerMenu.getText().substring(0, layerMenu.getText().length() - func[i].length() - 1));
                    return;
                }
            }
            layerMenu.setText(layerMenu.getText().substring(0, layerMenu.getText().length() - 1));
        }
    }

    @FXML
    protected void procClick() {
        layerMenu.setText(layerMenu.getText() + "mod(");
    }

    @FXML
    protected void DelButton() {
        layerMenu.setText(layerMenu.getText() + "/");
    }

    @FXML
    protected void MulButtonClick() {
        layerMenu.setText(layerMenu.getText() + "*");
    }

    @FXML
    protected void AddButtonClick() {
        layerMenu.setText(layerMenu.getText() + "+");
    }

    @FXML
    protected void SubButtonClick() {
        layerMenu.setText(layerMenu.getText() + "-");
    }

    @FXML
    protected void TanButtonClick() {
        layerMenu.setText(layerMenu.getText() + "tan(");
    }

    @FXML
    protected void CosButtonClick() {
        layerMenu.setText(layerMenu.getText() + "cos(");
    }

    @FXML
    protected void SinButtonClick() {
        layerMenu.setText(layerMenu.getText() + "sin(");
    }

    @FXML
    protected void AtanButtonClick() {
        layerMenu.setText(layerMenu.getText() + "atan(");
    }

    @FXML
    protected void ArcsinButtonClick() {
        layerMenu.setText(layerMenu.getText() + "arcsin(");
    }

    @FXML
    protected void ArccosButtonClick() {
        layerMenu.setText(layerMenu.getText() + "arccos(");
    }

    @FXML
    protected void LnButtonClick() {
        layerMenu.setText(layerMenu.getText() + "ln(");
    }

    @FXML
    protected void LogButtonClick() {
        layerMenu.setText(layerMenu.getText() + "log(");
    }

    @FXML
    protected void SqrtButtonClick() {
        layerMenu.setText(layerMenu.getText() + "sqrt(");
    }

    @FXML
    protected void PowButtonClick() {
        layerMenu.setText(layerMenu.getText() + "^");
    }

    @FXML
    protected void LeftBracketButtonClick() {
        layerMenu.setText(layerMenu.getText() + "(");
    }

    @FXML
    protected void RightBracketButtonClick() {
        layerMenu.setText(layerMenu.getText() + ")");
    }

    @FXML
    protected void PiButtonClick() {
        layerMenu.setText(layerMenu.getText() + "E");
    }

    @FXML
    protected void XButtonClick() {
        layerMenu.setText(layerMenu.getText() + "x");
    }

    @FXML
    protected void EqualButtonClick() {
        Object selectedItem = listViewHistory.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            layerMenu.setText(selectedItem.toString());
            listViewHistory.getItems().remove(selectedItem);
            listViewHistory.getSelectionModel().clearSelection();
        } else if (selectedItem == null && layerMenu.getText().length() > 0 && layerMenu.getText().length() < 256) {
            listViewHistory.getItems().add(layerMenu.getText());
            layerMenu.setText(nativeLib.Arithmetic(layerMenu.getText(), TextField.getText()).replaceAll("\\.?0*$", ""));
            listViewHistory.scrollTo(listViewHistory.getItems().size() - 1);
        } else if (selectedItem == null && layerMenu.getText().length() == 0) {
            listViewHistory.getItems().clear();
        }
        listViewCopy = listViewHistory;
    }

    @FXML
    protected void GraphButtonClick() {
        layerMenu1.setText(layerMenu.getText());
        try {
            double min = (MinTextField == null || MinTextField.getText().equals("")) ? -10.0 : Double.parseDouble(MinTextField.getText());
            double max = (MaxTextField == null || MaxTextField.getText().equals("")) ? 10.0 : Double.parseDouble(MaxTextField.getText());
            if (min < max) Paint(min, max);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void TextChange() {
        GraphButtonClick();
    }

    @FXML
    protected void clearClick() {
        listViewHistory.getItems().clear();
        listViewCopy.getItems().clear();
    }

    @FXML
    private void initialize() {
        nativeLib = new NativeLib();
        listViewCopy = listViewHistory;
        pathToJar = CalcApplication.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        pathToJar = pathToJar.substring(0, pathToJar.lastIndexOf("/")) + "/history.txt";
        if (!new File(pathToJar).exists()) return;
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToJar))) {
            String line;
            while ((line = reader.readLine()) != null) {
                listViewHistory.getItems().add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void Paint(double min, double max) {
        if (LineChart.getData().size() > 0) LineChart.getData().clear();
        XYChart.Series series = new XYChart.Series();
        series.setName("Graph");
        if (!nativeLib.Init(layerMenu.getText())) return;
        if (min < -1000000.0 || max > 1000000.0) return;
        double N = 100.0;
        double h = (max - min) / N;

        for (double i = min; i < max; i += h) {
            DecimalFormat df = new DecimalFormat("#.##");
            String str = String.valueOf(df.format(i));
//            System.out.println("min = " + min + ", max = " + max + ", h = " + h +", i = " + i + ", str = " + str);
            if (Double.isFinite(nativeLib.Graph(str)))
                series.getData().add(new XYChart.Data<>(str, nativeLib.Graph(str)));
        }

        LineChart.getData().add(series);
        LineChart.setCreateSymbols(false);
        LineChart.setLegendVisible(false);
        LineChart.setAnimated(false);
        LineChart.setCreateSymbols(false);
        LineChart.setLegendVisible(false);
        LineChart.setAnimated(false);

    }

    public static void SaveHistory() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToJar))) {
            for (int i = 0; listViewCopy != null && i < listViewCopy.getItems().size(); i++) {
                writer.write(listViewCopy.getItems().get(i).toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}